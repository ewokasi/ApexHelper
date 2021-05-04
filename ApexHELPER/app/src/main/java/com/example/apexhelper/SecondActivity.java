package com.example.apexhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Button bloodhound = (Button) findViewById(R.id.Bloodhound_button);
        bloodhound.setOnClickListener(this);

        Button gibraltar = (Button) findViewById(R.id.Gibraltar_button);
        gibraltar.setOnClickListener(this);

        Button Wraith = (Button) findViewById(R.id.Wraith_button);
        Wraith.setOnClickListener(this);

        Button lifeline = (Button) findViewById(R.id.Lifeline_button);
        lifeline.setOnClickListener(this);

        Button octane = (Button) findViewById(R.id.Octane_button);
        octane.setOnClickListener(this);

        Button mirage = (Button) findViewById(R.id.Mirage_button);
        mirage.setOnClickListener(this);

        Button caustic = (Button) findViewById(R.id.Caustic_button);
        caustic.setOnClickListener(this);

        Button pathfinder = (Button) findViewById(R.id.Pathfinder_button);
        pathfinder.setOnClickListener(this);

        Button  bangalore= (Button) findViewById(R.id.Banglore_button);
        bangalore.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.Bloodhound_button:
                Intent intent = new Intent(getApplicationContext(), thirdActivity.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.Gibraltar_button:
                Intent intent = new Intent(getApplicationContext(), gibraltarpage.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.Wraith_button:
                Intent intent = new Intent(getApplicationContext(), wraithpage.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.Banglore_button:
                Intent intent = new Intent(getApplicationContext(), page_banglore.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.Caustic_button:
                Intent intent = new Intent(getApplicationContext(), page_caustic.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.Octane_button:
                Intent intent = new Intent(getApplicationContext(), page_octane.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.Pathfinder_button:
                Intent intent = new Intent(getApplicationContext(), page_pathfinder.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.Mirage_button:
                Intent intent = new Intent(getApplicationContext(), page_mirage.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.Lifeline_button:
                Intent intent = new Intent(getApplicationContext(), page_lifeline.class);
                startActivity(intent);
                break;

        }

    }
}