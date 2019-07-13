package com.example.donchallengeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button myFirstButton1;

                private Button mySecondButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myFirstButton1 = (Button)findViewById(R.id.button1);

        mySecondButton2 = (Button)findViewById(R.id.button2);

        myFirstButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this,alc.class));
            }
        });

        mySecondButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this,MyProfile.class));

            }
        });


    }
}
