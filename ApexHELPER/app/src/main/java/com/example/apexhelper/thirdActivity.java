package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thirdActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button tip = (Button) findViewById(R.id.bloodhound_tip);
        tip.setOnClickListener(this);
    }
        @Override
        public void onClick(View v) {


            switch (v.getId()) {

                case R.id.bloodhound_tip:
                    Intent intent = new Intent(getApplicationContext(), bloodhound_tip.class);
                    startActivity(intent);
                    break;

            }
        }

    }

