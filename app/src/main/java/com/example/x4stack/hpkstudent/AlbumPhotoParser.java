package com.example.x4stack.hpkstudent;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class AlbumPhotoParser extends AsyncTask<String, Void, ArrayList<String>> {
    private AlbumPhotoActivity caller;
    private String albumURL;

    AlbumPhotoParser(AlbumPhotoActivity caller, String albumURL) {
        this.caller = caller;
        this.albumURL = albumURL;
    }

    @Override
    protected ArrayList<String> doInBackground(String... strings) {
        Document doc = null;
        Elements res = null;
        ArrayList<String> links = new ArrayList<String>();
        try {
            doc = Jsoup.connect(albumURL).get();
            res = doc.select("img.attachment-large");
            for (Element item : res) {
                links.add(item.attr("src"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return links;
    }

    @Override
    protected void onPostExecute(ArrayList<String> strings) {
        super.onPostExecute(strings);
        caller.imageURLs = strings;
        caller.recyclerView.getAdapter().notifyDataSetChanged();
    }

}
