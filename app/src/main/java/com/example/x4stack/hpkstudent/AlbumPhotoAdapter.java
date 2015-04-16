package com.example.x4stack.hpkstudent;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

public class AlbumPhotoAdapter extends RecyclerView.Adapter<PhotoViewHolder> {

    private PhotoClickListener callback;
    private Context context;

    AlbumPhotoAdapter(Context context, PhotoClickListener callback) {
        this.context = context;
        this.callback = callback;
    }

    @Override
    public PhotoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.photos_view, parent, false);
        return new PhotoViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return AlbumPhotoActivity.imageURLs.size();
    }

    @Override
    public void onBindViewHolder(PhotoViewHolder holder, final int position) {
        Picasso.with(context)
                .load(AlbumPhotoActivity.imageURLs.get(position))
                .fit()
                .centerCrop()
                .into(holder.image);
        if (callback != null) {
            holder.image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    callback.OnPhotoClicked(position);
                }
            });
        }
    }
}
