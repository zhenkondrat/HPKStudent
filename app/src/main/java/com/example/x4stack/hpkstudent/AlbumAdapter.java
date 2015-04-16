package com.example.x4stack.hpkstudent;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;


public class AlbumAdapter extends RecyclerView.Adapter<AlbumViewHolder> {

    private AlbumClickListener albumClickListener;
    private Context context;

    public AlbumAdapter(Context context, AlbumClickListener albumClickListener) {
        this.context = context;
        this.albumClickListener = albumClickListener;
    }

    @Override
    public int getItemCount() {
        return AlbumFragment.albums.size();
    }

    @Override
    public void onBindViewHolder(AlbumViewHolder viewHolder, final int i) {
        Album album = AlbumFragment.albums.get(i);
        viewHolder.albumName.setText(album.getAlbumName());
        viewHolder.albumDescription.setText(album.getAlbumDescription());
        viewHolder.wrapper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                albumClickListener.OnAlbumClickListener(i);
            }
        });
        Picasso.with(context).load(album.getImageURL()).into(viewHolder.albumCover);
    }

    @Override
    public AlbumViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.album_view, viewGroup, false);
        return new AlbumViewHolder(view);
    }

}
