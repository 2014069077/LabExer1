package com.krisha.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondActivity extends AppCompatActivity {

    EditText rawave;
    EditText finalgrade;
    Button btn_Back;

    //double rg;
    //double fg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        rawave = (EditText) findViewById(R.id.rawaverage);
        finalgrade = (EditText) findViewById(R.id.finalgrade);
        btn_Back = (Button) findViewById(R.id.goback);

        String rawave = getIntent().getExtras().getString("rawaverage");
        rawave.setText(rawave);
        String finalgrade = getIntent().getExtras().getString("finalgrade");
        finalgrade.setText((finalgrade));
    }

    public void goBackToMain (View view)
    {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }


}