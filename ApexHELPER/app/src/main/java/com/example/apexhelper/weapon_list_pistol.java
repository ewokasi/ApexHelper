package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class weapon_list_pistol extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon_list_pistol);

        Button wing = (Button) findViewById(R.id.wingman_button);
        wing.setOnClickListener(this);
        Button re45 = (Button) findViewById(R.id.re45_button);
        re45.setOnClickListener(this);
        Button p2020 = (Button) findViewById(R.id.p2020_button);
        p2020.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.re45_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_pistol_re45.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.p2020_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_pistol_p2020.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.wingman_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_pistol_wingman.class);
                startActivity(intent);
                break;

        }
    }
}
