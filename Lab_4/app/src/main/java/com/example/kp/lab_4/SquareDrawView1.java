package com.example.kp.lab_4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class SquareDrawView1 extends View {
    Paint paint = new Paint();

    public SquareDrawView1(Context context) {
        super(context);
        paint.setColor(0xff000000);
    }

    public SquareDrawView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(0xff000000);
    }

    public SquareDrawView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint.setColor(0xff000000);
    }

    @Override
    public void onDraw(Canvas canvas) {

        canvas.drawRect(0, 0, 75, 75, paint);

    }

}
