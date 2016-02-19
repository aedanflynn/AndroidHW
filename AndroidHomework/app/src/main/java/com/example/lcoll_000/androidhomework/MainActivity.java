package com.example.lcoll_000.androidhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    public int correct = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(start);
            }
        });
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
}
