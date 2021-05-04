package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button swith = (Button) findViewById(R.id.button1);

        Button swith3 = (Button) findViewById(R.id.weapons_button);
        Button stats = (Button) findViewById(R.id.stats);

        Button med = (Button) findViewById(R.id.meds_button);
        stats.setOnClickListener(this);
        med.setOnClickListener(this);
        swith.setOnClickListener(this);

        swith3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.button1:
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
                break;
        }

        switch (v.getId()) {

            case R.id.meds_button:
                Intent intent = new Intent(getApplicationContext(), meds.class);
                startActivity(intent);
                break;
        }


        switch (v.getId()) {

            case R.id.weapons_button:
                Intent intent = new Intent(getApplicationContext(), weapons_list.class);
                startActivity(intent);
                break;
        }


        switch (v.getId()) {

            case R.id.stats:
                Intent intent = new Intent(getApplicationContext(), weber.class);
                startActivity(intent);
                break;
        }


    }
}