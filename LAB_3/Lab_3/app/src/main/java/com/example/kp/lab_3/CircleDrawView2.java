package com.example.kp.lab_3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CircleDrawView2 extends View {
    Paint paint = new Paint();

    public CircleDrawView2(Context context) {
        super(context);
        paint.setColor(0xff947811);
    }

    public CircleDrawView2(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(0xff947811);
    }

    public CircleDrawView2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint.setColor(0xff947811);
    }


    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(150, 150, 100, paint);
    }

}
