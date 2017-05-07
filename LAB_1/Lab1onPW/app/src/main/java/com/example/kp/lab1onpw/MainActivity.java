package com.example.kp.lab1onpw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button buttonfirst;
    Button buttonsecond;
    TextView text;










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonfirst=(Button)findViewById(R.id.buttonfirst);
        buttonsecond=(Button)findViewById(R.id.buttonsecond);
        text=(TextView)findViewById(R.id.text);

        buttonsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setTextColor(0xff234500);
            }
        });

        buttonfirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonfirst.setBackgroundColor(0xff000123);
                buttonfirst.setText("HeyYouDidIt");
            }
        });











    }
}
