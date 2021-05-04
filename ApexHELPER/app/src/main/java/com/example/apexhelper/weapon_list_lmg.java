package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class weapon_list_lmg extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon_list_lmg);

        Button sf = (Button) findViewById(R.id.spitfair_button);
        sf.setOnClickListener(this);

        Button devotion = (Button) findViewById(R.id.devotion_button);
        devotion.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.spitfair_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_lmg_spitfair.class);
                startActivity(intent);
                break;

        }

        switch (v.getId()) {

            case R.id.devotion_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_lmg_devotion.class);
                startActivity(intent);
                break;

        }
    }
}
