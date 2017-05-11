package com.example.kp.lab_3;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;

import android.util.AttributeSet;
import android.view.View;

public class OvalDrawView extends View {
    Paint paint = new Paint();

    public OvalDrawView(Context context) {
        super(context);
        paint.setColor(Color.MAGENTA);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(7);
    }

    public OvalDrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(Color.MAGENTA);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(7);
    }

    public OvalDrawView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint.setColor(Color.MAGENTA);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(7);
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onDraw(Canvas canvas) {

        canvas.drawOval(20, 20, 300, 125, paint);
    }

}
