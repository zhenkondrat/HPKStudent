package com.example.x4stack.hpkstudent;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AlbumViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public ImageView albumCover;
    public TextView albumName, albumDescription;

    public AlbumViewHolder(View view) {
        super(view);
        albumCover = (ImageView) view.findViewById(R.id.album_cover);
        albumName = (TextView) view.findViewById(R.id.album_name);
        albumDescription = (TextView) view.findViewById(R.id.album_description);
    }

    @Override
    public void onClick(View view) {

    }
}

