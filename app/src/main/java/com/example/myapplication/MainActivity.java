package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    public CardView tcl, intC,PH,RL,PM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tcl = (CardView) findViewById(R.id.tcl);
        intC = (CardView) findViewById(R.id.ic);
        PH = (CardView) findViewById(R.id.ph);
        RL = (CardView) findViewById(R.id.rl);
        PM = (CardView) findViewById(R.id.pm);

        tcl.setOnClickListener(this);
        intC.setOnClickListener(this);
        PH.setOnClickListener(this);
        RL.setOnClickListener(this);



}

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()){
            case R.id.tcl:
                i = new Intent(this,CTM.class);
                startActivity(i);
                break;
            case R.id.ic:
                i = new Intent(this,TCL.class);
                startActivity(i);
                break;
            case R.id.ph:
                i = new Intent(this,TCL.class);
                startActivity(i);
                break;
            case R.id.rl:
                i = new Intent(this,TCL.class);
                startActivity(i);
                break;


        }

    }



}