package com.example.lcoll_000.androidhomework;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.play_frag_container, Question1.newInstance(null, null))
                .addToBackStack(null)
                .commit();

    }

}
