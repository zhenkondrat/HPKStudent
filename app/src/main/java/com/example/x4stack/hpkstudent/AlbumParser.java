package com.example.x4stack.hpkstudent;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class AlbumParser extends AsyncTask<String, Void, ArrayList<Album>> {

    private String AlbumURL = "http://hpk.edu.ua/gallery";

    @Override
    protected ArrayList<Album> doInBackground(String... strings) {
        ArrayList<Album> albums = new ArrayList<Album>();
        try {
            do {
                Document doc = Jsoup.connect(AlbumURL).get();
                Elements names = doc.select("h1.gallery-title");
                Elements descriptions = doc.select("p.gallery-description");
                Elements countPhotos = doc.select()
                Elements images = doc.select("img.wp-post-image");
                Elements links = doc.select("h1.gallery-title a");

                for (int i = 0; i < names.size(); i++) {
                    albums.add(new Album(
                            names.get(i).text(),
                            descriptions.get(i).text(),
                            10,
                            images.get(i).attr("src"),
                            links.get(i).absUrl("href")));
                }

                Elements next = doc.select("a.next");
                if (next.size() == 0) {
                    AlbumURL = null;
                } else {
                    AlbumURL = next.get(0).absUrl("href");
                }
            } while (AlbumURL != null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return albums;
    }

    @Override
    protected void onPostExecute(ArrayList<Album> arrayList) {
        super.onPostExecute(arrayList);
    }
}
