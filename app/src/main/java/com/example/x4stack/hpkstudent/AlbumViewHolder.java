package com.example.x4stack.hpkstudent;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AlbumViewHolder extends RecyclerView.ViewHolder{
    public View wrapper;
    public ImageView albumCover;
    public TextView albumName, albumDescription;

    public AlbumViewHolder(View view) {
        super(view);
        wrapper = view;
        albumCover = (ImageView) view.findViewById(R.id.album_cover);
        albumName = (TextView) view.findViewById(R.id.album_name);
        albumDescription = (TextView) view.findViewById(R.id.album_description);
    }
}

