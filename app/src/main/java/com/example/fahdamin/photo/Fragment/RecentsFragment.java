package com.example.fahdamin.photo.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fahdamin.photo.R;

public class RecentsFragment extends Fragment {
    static RecentsFragment INSTANCE=null;
    public RecentsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static RecentsFragment getInstance(){
        if(INSTANCE==null)
            INSTANCE=new RecentsFragment();
        return INSTANCE;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recents, container, false);
    }

}
