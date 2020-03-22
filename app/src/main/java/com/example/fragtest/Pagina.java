package com.example.fragtest;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Pagina.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Pagina#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Pagina extends Fragment {

    private Button mButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_pagina, container,false);
        mButton=vista.findViewById(R.id.new_fragment_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                Fragment newPage = new Pagina2();
                fm.beginTransaction().replace(R.id.fragment_hoster,newPage).addToBackStack(null).commit();
            }
        });
        return vista;
    }

}
