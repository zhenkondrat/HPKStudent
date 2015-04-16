package com.example.x4stack.hpkstudent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shpak on 16.04.15.
 */
public class FragmentReplacement extends Fragment {
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_replacement, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        //recyclerView=(RecyclerView)view.findViewById(R.id.replacement_list);

    }

}
