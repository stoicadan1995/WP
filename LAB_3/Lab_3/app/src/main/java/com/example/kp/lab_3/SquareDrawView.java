package com.example.kp.lab_3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class SquareDrawView extends View {
    Paint paint = new Paint();

    public SquareDrawView(Context context) {
        super(context);
        paint.setColor(0xffff6767);
    }

    public SquareDrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(0xffff6767);
    }

    public SquareDrawView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint.setColor(0xffff6767);
    }

    @Override
    public void onDraw(Canvas canvas) {

        canvas.drawRect(0, 0, 75, 75, paint);

    }

}
