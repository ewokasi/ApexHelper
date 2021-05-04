package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wraithpage extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wraithpage);
        Button tip = (Button) findViewById(R.id.wraith_tip);
        tip.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.wraith_tip:
                Intent intent = new Intent(getApplicationContext(), wraith_tip.class);
                startActivity(intent);
                break;

        }
    }
}
