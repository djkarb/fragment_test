package com.example.fragtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        Fragment frag = fm.findFragmentById(R.id.fragment_hoster);
        if(frag==null)
        {
            Fragment pagina = new Pagina();
            FragmentTransaction x = fm.beginTransaction();
            x.add(R.id.fragment_hoster,pagina).commit();
        }
    }
}
