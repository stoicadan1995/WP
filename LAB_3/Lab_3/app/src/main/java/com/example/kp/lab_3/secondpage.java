package com.example.kp.lab_3;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.RelativeLayout;

public class secondpage extends AppCompatActivity {

    public static RadialGradient gradient;

    public static RadialGradient gradient2;
    CircleDrawView1 circle;
    OvalDrawView1 oval;

    Button drawBitmap;
    Button keysbutt;

    RelativeLayout mainPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        keysbutt=(Button) findViewById(R.id.keysbutt);
        drawBitmap = (Button) findViewById(R.id.drawBitmap);
        circle=(CircleDrawView1)findViewById(R.id.circleg);
        oval=(OvalDrawView1)findViewById(R.id.ovalg);

        mainPage = (RelativeLayout) findViewById(R.id.mainPage);

        keysbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager inputMethodManager=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);
            }
        });

        drawBitmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap createdBitmap = getBitmapFromView(mainPage);

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Bitmap Was created").setTitle("Success").setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).create();

                builder.show();
            }
        });
    }

    public static Bitmap getBitmapFromView(RelativeLayout view){
        Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        view.draw(canvas);
        return bitmap;

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
