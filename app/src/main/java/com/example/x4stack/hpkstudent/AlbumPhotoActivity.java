package com.example.x4stack.hpkstudent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class AlbumPhotoActivity extends ActionBarActivity {

    private int albumID;
    public static ArrayList<String> imageURLs = new ArrayList<String>();
    public static RecyclerView photosView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_photo);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            albumID = bundle.getInt(AlbumFragment.ALBUM_ID);
        }

        (new AlbumPhotoParser(AlbumFragment.albums.get(albumID).getAlbumLink())).execute();

        photosView = (RecyclerView) findViewById(R.id.photos_list);
        photosView.setAdapter(new AlbumPhotoAdapter(this));
        photosView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_album_photo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.action_settings:
            {
                return true;
            }
            case R.id.home:
            {
                finish();
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }
}
