package com.example.projetjava.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.projetjava.R;


public class Liste extends Fragment {



    public Liste() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_liste, container, false);
        String[] list_livre = {"livre1","livre2","livre3","livre4"};
        ListView listview = (ListView) view.findViewById(R.id.listView_livre);
        ArrayAdapter<String> listviewAdapter =new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,list_livre );
        listview.setAdapter(listviewAdapter);

        return view;
    }
}