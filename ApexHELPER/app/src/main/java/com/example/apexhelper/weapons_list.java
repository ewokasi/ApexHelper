package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class weapons_list extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapons_list);

        Button smg = (Button) findViewById(R.id.smg_button);
        smg.setOnClickListener(this);

        Button lmg = (Button) findViewById(R.id.lmg_button);
        lmg.setOnClickListener(this);

        Button sniper = (Button) findViewById(R.id.sniper_button);
        sniper.setOnClickListener(this);

        Button pistol = (Button) findViewById(R.id.pistol_button);
        pistol.setOnClickListener(this);

        Button shotgun = (Button) findViewById(R.id.shotgun_button);
        shotgun.setOnClickListener(this);

        Button carabine = (Button) findViewById(R.id.carabine_button);
       carabine.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.smg_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_smg.class);
                startActivity(intent);
                break;
        }

        switch (v.getId()) {

            case R.id.lmg_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_lmg.class);
                startActivity(intent);
                break;
        }




        switch (v.getId()) {

            case R.id.shotgun_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_shotgun.class);
                startActivity(intent);
                break;
        }

        switch (v.getId()) {

            case R.id.pistol_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_pistol.class);
                startActivity(intent);
                break;
        }
        switch (v.getId()) {

            case R.id.carabine_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_carabine.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.sniper_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_sniper.class);
                startActivity(intent);
                break;
        }
    }
}