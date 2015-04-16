package com.example.x4stack.hpkstudent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
<<<<<<< HEAD
import android.support.v7.widget.LinearLayoutManager;
=======
>>>>>>> 82d9aa4c54e3af044297decdffcc7326437e3c9a
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

<<<<<<< HEAD
import java.util.ArrayList;

public class ReplacementFragment extends Fragment {
    public RecyclerView recyclerView;
    public static ArrayList<Replacement> replacements = new ArrayList<Replacement>();
=======
public class ReplacementFragment extends Fragment {
    private RecyclerView recyclerView;
>>>>>>> 82d9aa4c54e3af044297decdffcc7326437e3c9a

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_replacement, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
<<<<<<< HEAD
        recyclerView=(RecyclerView)view.findViewById(R.id.replacement_list);
        recyclerView.setAdapter(new ReplacementAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
=======
        //recyclerView=(RecyclerView)view.findViewById(R.id.replacement_list);

>>>>>>> 82d9aa4c54e3af044297decdffcc7326437e3c9a
    }

}
