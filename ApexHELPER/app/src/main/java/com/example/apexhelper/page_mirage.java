package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page_mirage extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_mirage);

        Button tip = (Button) findViewById(R.id.mirage_tip);
        tip.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.mirage_tip:
                Intent intent = new Intent(getApplicationContext(), mirage_tip.class);
                startActivity(intent);
                break;

        }
    }

}
