package com.example.radiobutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    public Button btn_defult, btn_check;
    public RadioButton rd_red, rd_green, rd_blue;
    public LinearLayout lnr_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_defult = findViewById(R.id.btn_defult);
        btn_check = findViewById(R.id.btn_check);

        rd_red = findViewById(R.id.rd_red);
        rd_green = findViewById(R.id.rd_green);
        rd_blue = findViewById(R.id.rd_blue);

        lnr_layout = findViewById(R.id.lnr_layout);
    }

    public void check(View view) {
        if(rd_red.isChecked()){
            lnr_layout.setBackgroundColor(Color.RED);
        }

        if(rd_green.isChecked()){
            lnr_layout.setBackgroundColor(Color.GREEN);
        }

        if(rd_blue.isChecked()){
            lnr_layout.setBackgroundColor(Color.BLUE);
        }
    }

    public void defult(View view) {
        lnr_layout.setBackgroundColor(Color.WHITE);
    }
}
