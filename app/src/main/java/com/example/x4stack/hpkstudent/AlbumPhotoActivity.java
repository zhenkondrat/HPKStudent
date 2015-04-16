package com.example.x4stack.hpkstudent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class AlbumPhotoActivity extends ActionBarActivity implements PhotoClickListener {

    private int albumID;
    public static final String CURRENT_PHOTO = "current_photo";
    public static ArrayList<String> imageURLs = new ArrayList<String>();
    public RecyclerView recyclerView;

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

        (new AlbumPhotoParser(this, AlbumFragment.albums.get(albumID).getAlbumLink())).execute();

        recyclerView = (RecyclerView) findViewById(R.id.photos_list);
        recyclerView.setAdapter(new AlbumPhotoAdapter(this, this));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
    }

    @Override
    protected void onStop() {
        super.onStop();
        imageURLs = new ArrayList<>();
        recyclerView.getAdapter().notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_album_photo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings: {
                return true;
            }
            case R.id.home: {
                finish();
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void OnPhotoClicked(int position) {
        Intent intent = new Intent(this, PhotoActivity.class);
        intent.putExtra(CURRENT_PHOTO, position);
        startActivity(intent);
    }
}
