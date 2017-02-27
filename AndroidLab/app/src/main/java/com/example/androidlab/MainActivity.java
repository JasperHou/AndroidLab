package com.example.androidlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello = (TextView)findViewById(R.id.hello);
        hello.setText(R.string.PARKING_SEARCH_KEY_WORD);
    }
}
