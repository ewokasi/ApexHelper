package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page_lifeline extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_lifeline);

        Button tip = (Button) findViewById(R.id.lifeline_tip2);
        tip.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.lifeline_tip2:
                Intent intent = new Intent(getApplicationContext(), lifeline_tip.class);
                startActivity(intent);
                break;

        }
    }
}
