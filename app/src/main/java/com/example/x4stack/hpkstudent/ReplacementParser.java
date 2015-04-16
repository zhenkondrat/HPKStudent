package com.example.x4stack.hpkstudent;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class ReplacementParser extends AsyncTask<String, Void, ArrayList<Replacement>> {
    private String ReplacmentURL = "http://hpk.edu.ua/replacements";
    private ReplacementFragment caller;

    ReplacementParser(ReplacementFragment replacementFragment) {
        caller = replacementFragment;
    }

    @Override
    protected ArrayList<Replacement> doInBackground(String... strings) {
        ArrayList<Replacement> replacements = new ArrayList<Replacement>();
        try {
            Document doc = Jsoup.connect(ReplacmentURL).get();
            Elements tr = doc.select("tr");

            for (int i = 0; i < tr.size(); i++) {
                Elements td = tr.get(i).select("td");
                replacements.add(new Replacement(
                        td.get(0).text(),
                        td.get(1).text(),
                        td.get(2).text(),
                        td.get(3).text(),
                        td.get(4).text(),
                        td.get(5).text()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return replacements;
    }

    @Override
    protected void onPostExecute(ArrayList<Replacement> arrayList) {
        super.onPostExecute(arrayList);
        caller.replacements = arrayList;
        caller.recyclerView.getAdapter().notifyDataSetChanged();
    }
}
