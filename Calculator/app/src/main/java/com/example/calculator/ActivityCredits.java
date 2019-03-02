package com.example.calculator;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityCredits extends AppCompatActivity {
    Button btnBack;
    TextView tv;
    double ts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        btnBack=findViewById(R.id.btnBack);
        tv=findViewById(R.id.tv);
        Intent gi=getIntent();
        ts=gi.getDoubleExtra("t",1);
        tv.setText(""+ts);
    }

    public void Back(View view) {
        Intent bc=new Intent(this, MainActivity.class);
        startActivity(bc);
    }
}
