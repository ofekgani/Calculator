package com.example.ofekg.imageview3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button btn;
    public ImageView img;
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        img = findViewById(R.id.img);
    }

    public void go(View view) {
        Random hatsil = new Random();
        num = hatsil.nextInt(3)+1;
        switch (num){
            case 1: {
                btn.setText(""+num);
                img.setImageResource(R.drawable.image1);
                break;
            }
            case 2: {
                btn.setText(""+num);
                img.setImageResource(R.drawable.image2);
                break;
            }
            case 3: {
                btn.setText(""+num);
                img.setImageResource(R.drawable.tanos1);
                break;
            }


        }

    }
}
