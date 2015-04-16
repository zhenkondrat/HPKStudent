package com.example.x4stack.hpkstudent;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class PhotoViewHolder extends RecyclerView.ViewHolder {
    public ImageView image;

    public PhotoViewHolder(View view) {
        super(view);
        image = (ImageView) view.findViewById(R.id.photo_view);
    }
}
