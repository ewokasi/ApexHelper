package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class weapon_list_smg extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon_list_smg);

        Button alt = (Button) findViewById(R.id.alternator_button);
        alt.setOnClickListener(this);

        Button r99 = (Button) findViewById(R.id.r99_button);
        r99.setOnClickListener(this);

        Button isheika = (Button) findViewById(R.id.isheika_button);
        isheika.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.isheika_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_smg_isheika.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.r99_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_smg_r99.class);
                startActivity(intent);
                break;

        }
        switch (v.getId()) {

            case R.id.alternator_button:
                Intent intent = new Intent(getApplicationContext(), weapon_list_smg_alternator.class);
                startActivity(intent);
                break;

        }
    }
}
