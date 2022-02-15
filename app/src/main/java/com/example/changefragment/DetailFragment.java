package com.example.changefragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DetailFragment extends Fragment {



    public DetailFragment() {
        // Required empty public constructor
    }

    public void setSelectedItem(String selectedItem)
    {
        TextView view=getView().findViewById(R.id.textview);
        view.setText(selectedItem);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }
}