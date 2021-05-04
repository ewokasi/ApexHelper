package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page_octane extends AppCompatActivity  implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_octane);

        Button tip = (Button) findViewById(R.id.octane_tip);
        tip.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.octane_tip:
                Intent intent = new Intent(getApplicationContext(), octane_tip.class);
                startActivity(intent);
                break;

        }
    }
}
