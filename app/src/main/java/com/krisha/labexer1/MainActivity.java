package com.krisha.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText quiz1;
    EditText quiz2;
    EditText seatWork;
    EditText labExer;
    EditText majorExam;

    Double rawave;
    Double finalgrade;
    Button btn_Send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quiz1 = (EditText) findViewById(R.id.inputquiz1);
        quiz2 = (EditText) findViewById(R.id.inputquiz2);
        seatWork = (EditText) findViewById(R.id.inputseatWork);
        labExer = (EditText) findViewById(R.id.inputlabexer);
        majorExam = (EditText) findViewById(R.id.inputmajorExam);
        btn_Send = (Button) findViewById(R.id.btnNext);

    }

    public void callSecondActivity (View view){
        Double quiz1Score = Double.parseDouble(quiz1.getText().toString());
        Double quiz2Score = Double.parseDouble(quiz2.getText().toString());
        Double seatScore = Double.parseDouble(seatWork.getText().toString());
        Double labScore = Double.parseDouble(labExer.getText().toString());
        Double majorScore = Double.parseDouble(majorExam.getText().toString());

        rawave = (quiz1Score * .1) + (quiz2Score * .1) + (seatScore * .1) + (labScore * .4) + (majorScore * .3);

        if (rawave < 60) {
            finalgrade = 5.0;
        } else if (rawave >= 60 && rawave < 66) {
            finalgrade = 3.0;
        } else if (rawave >= 66 && rawave < 71) {
            finalgrade = 2.75;
        } else if (rawave >= 71 && rawave < 76) {
            finalgrade = 2.5;
        } else if (rawave >= 76 && rawave < 81) {
            finalgrade = 2.25;
        } else if (rawave >= 81 && rawave < 86) {
            finalgrade = 2.0;
        } else if (rawave >= 86 && rawave < 91) {
            finalgrade = 1.75;
        } else if (rawave >= 91 && rawave < 93) {
            finalgrade = 1.5;
        } else if (rawave >= 93 && rawave < 95) {
            finalgrade = 1.25;
        } else if (rawave >= 95 && rawave <= 100) {
            finalgrade = 1.0;
        } else {
            finalgrade = 0.0;
        }

        Intent intent = new Intent(this, secondActivity.class);
        intent.putExtra("rawaverage", rawave.toString());
        intent.putExtra("finalgrade", finalgrade.toString());
        startActivity(intent);
    }




}
