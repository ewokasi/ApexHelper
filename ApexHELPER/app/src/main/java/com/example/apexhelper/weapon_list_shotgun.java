package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class weapon_list_shotgun extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon_list_shotgun);

        Button peace = (Button) findViewById(R.id.peacekeper_button);
        peace.setOnClickListener(this);

        Button eva = (Button) findViewById(R.id.eva_button);
        eva.setOnClickListener(this);

        Button moza = (Button) findViewById(R.id.mozajoke_button);
        moza.setOnClickListener(this);

        Button mastif = (Button) findViewById(R.id.mastif_button);
        mastif.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.peacekeper_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_shotgun_peacekeper.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.eva_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_shotgun_eva.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.mozajoke_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_shotgun_mozajoke.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.mastif_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_shotgun_mastif.class);
                startActivity(intent);
                break;
    }
}
}