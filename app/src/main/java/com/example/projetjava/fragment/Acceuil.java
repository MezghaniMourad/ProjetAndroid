package com.example.projetjava.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.projetjava.R;


public class Acceuil extends Fragment {

    Button b1;
    Button b2;
    Button b3;
    public Acceuil() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_acceuil, container, false);
        b1= v.findViewById(R.id.bottn_liste);
        b2= v.findViewById(R.id.bottn_ajouter);
        b3= v.findViewById(R.id.bottn_quitter);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Liste liste = new Liste();
                //FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                //transaction.replace(R.id.Acceuil,liste);
                //transaction.commit();
                Liste p = new Liste();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        return  v;
    }
}