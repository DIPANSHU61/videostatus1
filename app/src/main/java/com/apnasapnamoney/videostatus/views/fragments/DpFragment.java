package com.apnasapnamoney.videostatus.views.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apnasapnamoney.videostatus.R;
import com.apnasapnamoney.videostatus.adapter.DpAdapter;
import com.apnasapnamoney.videostatus.adapter.StatusAdapter;

public class DpFragment extends Fragment {

    public DpFragment() {
        // Required empty public constructor
    }

    RecyclerView dp_recyclerview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dp, container, false);
        dp_recyclerview = view.findViewById(R.id.dp_recyclerview);
        dp_recyclerview.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), 3);
        dp_recyclerview.setLayoutManager(layoutManager);

        // ArrayList<AndroidVersion> androidVersions = prepareData();
        //DataAdapter adapter = new DataAdapter(getApplicationContext(),androidVersions);
        DpAdapter videosAdapter = new DpAdapter(getActivity());
        dp_recyclerview.setAdapter(videosAdapter);
        return view;
    }

}
