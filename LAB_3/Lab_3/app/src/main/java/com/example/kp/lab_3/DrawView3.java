package com.example.kp.lab_3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class DrawView3 extends View {
    Paint paint = new Paint();

    public DrawView3(Context context) {
        super(context);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(25);
    }

    public DrawView3(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(25);
    }

    public DrawView3(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(25);
    }


    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawLine(0, 0, 200, 0, paint);
    }

}
