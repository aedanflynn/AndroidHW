package com.example.lcoll_000.androidhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    public int correct = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeCorrect(int number){
        correct = correct + number;
    }

    public void resetCorrect(){
        correct = 0;
    }

    public int getCorrect(){
        return correct;
    }
    private void onClick(){
        Intent start = new Intent(this, Question1.class);
        startActivity(start);
    }
}
