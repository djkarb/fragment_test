package com.example.fragtest;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Pagina2.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Pagina2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Pagina2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View pagina2 = inflater.inflate(R.layout.fragment_pagina2,container,false);
        return pagina2;
    }
}
