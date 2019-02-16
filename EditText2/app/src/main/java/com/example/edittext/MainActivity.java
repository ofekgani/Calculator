package com.example.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button btn;
    public EditText ed2;
    public EditText ed1;
    public EditText ed3;
    public TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        ed3=findViewById(R.id.ed3);
        btn=findViewById(R.id.btn);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);

    }

    public void click(View view) {
        String name=ed1.getText().toString().trim();
        tv1.setText("your number: " +name);
        String date=ed3.getText().toString().trim();
        tv2.setText("your name: "+date);
        String email=ed2.getText().toString().trim();
        tv3.setText("your date: "+email);
    }
}
