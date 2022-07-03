package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plusThreeA(View view){
        scoreA+=3;
        TextView quantityTextView = (TextView) findViewById(R.id.scoreA);
        quantityTextView.setText("" + scoreA);
    }
    public void plusThreeB(View view) {
        scoreB += 3;
        TextView quantityTextView = (TextView) findViewById(R.id.scoreB);
        quantityTextView.setText("" + scoreB);
    }

    public void plusTwoA(View view){
        scoreA+=2;
        TextView quantityTextView = (TextView) findViewById(R.id.scoreA);
        quantityTextView.setText("" + scoreA);
    }
    public void plusTwoB(View view) {
        scoreB += 2;
        TextView quantityTextView = (TextView) findViewById(R.id.scoreB);
        quantityTextView.setText("" + scoreB);
    }


    public void freeThrowA(View view){
        scoreA++;
        TextView quantityTextView = (TextView) findViewById(R.id.scoreA);
        quantityTextView.setText("" + scoreA);
    }
    public void freeThrowB(View view) {
        scoreB++;
        TextView quantityTextView = (TextView) findViewById(R.id.scoreB);
        quantityTextView.setText("" + scoreB);
    }

    public void reset(View view) {
        scoreA=0;
        scoreB=0;
        TextView quantityTextView = (TextView) findViewById(R.id.scoreA);
        quantityTextView.setText("" + scoreA);
        quantityTextView = (TextView) findViewById(R.id.scoreB);
        quantityTextView.setText("" + scoreB);
    }

}