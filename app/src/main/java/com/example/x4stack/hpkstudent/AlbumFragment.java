package com.example.x4stack.hpkstudent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AlbumFragment extends Fragment implements AlbumClickListener {

    public static ArrayList<Album> albums = new ArrayList<Album>();
    public RecyclerView recyclerView;
    public static final String ALBUM_ID = "albumID";

    public AlbumFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        (new AlbumParser(this)).execute();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_album, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.album_list);
        recyclerView.setAdapter(new AlbumAdapter(getActivity(), this));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    @Override
    public void OnAlbumClickListener(int position) {
        Intent intent = new Intent(getActivity(), AlbumPhotoActivity.class);
        intent.putExtra(ALBUM_ID, position);
        startActivity(intent);
    }
}
