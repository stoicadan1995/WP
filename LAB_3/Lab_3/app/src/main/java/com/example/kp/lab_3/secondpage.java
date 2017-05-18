package com.example.kp.lab_3;

import android.content.Context;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

public class secondpage extends AppCompatActivity {

    public static RadialGradient gradient;

    public static RadialGradient gradient2;
    CircleDrawView1 circle;
    OvalDrawView1 oval;

    Button keysbutt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        keysbutt=(Button) findViewById(R.id.keysbutt);
        circle=(CircleDrawView1)findViewById(R.id.circleg);
        oval=(OvalDrawView1)findViewById(R.id.ovalg);

        keysbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager inputMethodManager=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);
            }
        });
    }


    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {

       switch (keyCode){
           case KeyEvent.KEYCODE_C:
               gradient=new RadialGradient(0,0,150,0xff784596,0xff236598, Shader.TileMode.MIRROR);
               circle.invalidate();
               break;
           case KeyEvent.KEYCODE_O:
               gradient2=new RadialGradient(0,0,150,0xff675948,0xff349765, Shader.TileMode.MIRROR);
               oval.invalidate();
               break;
       }

    return true;
    }
}
