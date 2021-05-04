package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class weapon_list_sniper extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon_list_sniper);

        Button g7 = (Button) findViewById(R.id.g7_button);
        g7.setOnClickListener(this);

        Button tt = (Button) findViewById(R.id.tripletake_button);
        tt.setOnClickListener(this);

        Button kraber = (Button) findViewById(R.id.kraber_button);
        kraber.setOnClickListener(this);

        Button longb = (Button) findViewById(R.id.longbow_button);
        longb.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.tripletake_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_srifles_tripletake.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.longbow_button:
                Intent intent = new Intent(getApplicationContext(),weapon_list_srifles_longbow .class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.kraber_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_srifles_kraber .class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.g7_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_srifles_g7.class);
                startActivity(intent);
                break;

        }
    }
}
