package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class weapon_list_carabine extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon_list_carabine);

        Button hemlock = (Button) findViewById(R.id.hemlock_button);
        hemlock.setOnClickListener(this);

        Button fletline = (Button) findViewById(R.id.fletline_button);
        fletline.setOnClickListener(this);

        Button r301 = (Button) findViewById(R.id.r301_button);
        r301.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.hemlock_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_hemlock.class);
                startActivity(intent);
                break;

        }


        switch (v.getId()) {

            case R.id.fletline_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_carabine_fletline1.class);
                startActivity(intent);
                break;

        }


        switch (v.getId()) {

            case R.id.r301_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_carabine_r301.class);
                startActivity(intent);
                break;

        }
    }

}
