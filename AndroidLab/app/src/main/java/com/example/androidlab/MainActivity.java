package com.example.androidlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private Button sharedButton;


    @BindView(R.id.subscript) Button subscript;

    @OnClick(R.id.subscript) void OnClick() {
        subscript.setText("subscript clicked");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        sharedButton = (Button)findViewById(R.id.sharedButton);

        setOnclickListener();


    }

    private void setOnclickListener() {
        sharedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                Intent chooser = Intent.createChooser(intent, getString(R.string.say_hi));

                if(intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(chooser);
                }
            }
        });

    }
}