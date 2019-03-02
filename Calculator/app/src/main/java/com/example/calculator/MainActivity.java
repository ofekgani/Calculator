package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button btnPlus, btnMinus, btnMulti, btnDivision, btnEqual, btnClear, btnCredits;
    public EditText edPreview;

    double num0 = 0, num1 = 0, sum;
    boolean plus = false, minus = false , multi = false, division = false;
    boolean bl = false;
    String st;
    double nums;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMulti = findViewById(R.id.btnMulti);
        btnDivision = findViewById(R.id.btnDivision);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);
        btnCredits = findViewById(R.id.btnCredits);
        edPreview = findViewById(R.id.edPreview);
    }


    public void Plus(View view) {
       nums=1;
        st = edPreview.getText().toString();
        if(bl == false) {
            num0 = Double.parseDouble(st);
            bl = true;
        }else{
            num1 = Double.parseDouble(st);
            num0 += num1;
        }
        edPreview.setText("");
    }

    public void Minus(View view) {
        nums=2;
        st = edPreview.getText().toString();
        if(bl == false) {
            num0 = Double.parseDouble(st);
            bl = true;
        }else{
            num1 = Double.parseDouble(st);
            num0 -= num1;
        }
        edPreview.setText("");
    }

    public void Multi(View view) {
        nums=3;
        st = edPreview.getText().toString();
        if(bl == false) {
            num0 = Double.parseDouble(st);
            bl = true;
        }else{
            num1 = Double.parseDouble(st);
            num0 *= num1;
        }
        edPreview.setText("");
    }

    public void Division(View view) {
        nums=4;
        st = edPreview.getText().toString();
        if(bl == false) {
            num0 = Double.parseDouble(st);
            bl = true;
        }else{
            num1 = Double.parseDouble(st);
            num0 /= num1;
        }
        edPreview.setText("");
    }

    public void Equal(View view){
       if((bl == true) && (nums==1)){
           st = edPreview.getText().toString();
           num1 = Double.parseDouble(st);
           num0 += num1;
           edPreview.setText(""+num0);
           bl = false;
       }
        if((bl == true) && (nums==2)){
            st = edPreview.getText().toString();
            num1 = Double.parseDouble(st);
            num0 -= num1;
            edPreview.setText(""+num0);
            bl = false;
        }
        if((bl == true) && (nums==3)){
            st = edPreview.getText().toString();
            num1 = Double.parseDouble(st);
            num0 *= num1;
            edPreview.setText(""+num0);
            bl = false;
        }
        if((bl == true) && (nums==4)){
            st = edPreview.getText().toString();
            num1 = Double.parseDouble(st);
            num0 /= num1;
            edPreview.setText(""+num0);
            bl = false;
        }

    }

    public void Clear(View view){
        edPreview.setText("");
        num0=0;
        num1=0;
        bl=false;
    }

    public void credits(View view) {
        Intent si=new Intent(this, ActivityCredits.class);
        si.putExtra("t",num0);
        startActivity(si);
    }
}
