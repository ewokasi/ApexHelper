package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page_banglore extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_banglore);

        Button tip = (Button) findViewById(R.id.banglore_tip);
        tip.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.banglore_tip:
                Intent intent = new Intent(getApplicationContext(), banglore_tip.class);
                startActivity(intent);
                break;

        }
    }
}
