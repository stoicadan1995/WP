package com.example.kp.lab_3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;

import android.util.AttributeSet;
import android.view.View;

public class CircleDrawView extends View {
    Paint paint = new Paint();

    public CircleDrawView(Context context) {
        super(context);
        paint.setColor(0xff947811);
    }

    public CircleDrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(0xff947811);
    }

    public CircleDrawView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint.setColor(0xff947811);
    }


    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(150, 150, 100, paint);
    }

}
