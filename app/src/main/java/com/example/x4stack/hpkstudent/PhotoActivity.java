package com.example.x4stack.hpkstudent;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


public class PhotoActivity extends ActionBarActivity {
    private int currentPhoto = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            currentPhoto = bundle.getInt(AlbumPhotoActivity.CURRENT_PHOTO);
        }
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        if (savedInstanceState != null) {
            Picasso.with(this).load(savedInstanceState.getString("imageurl")).into(imageView);
        } else {
            Picasso.with(this).load(AlbumPhotoActivity.imageURLs.get(currentPhoto)).into(imageView);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("imageurl", AlbumPhotoActivity.imageURLs.get(currentPhoto));
    }


}
