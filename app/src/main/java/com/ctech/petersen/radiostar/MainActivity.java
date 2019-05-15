package com.ctech.petersen.radiostar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText vidTitle;
    private static final String API_KEY = "AIzaSyDd30ot3W9T-DJGYlypX75kUruWuNqzCfI";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

