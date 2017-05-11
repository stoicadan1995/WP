package com.example.kp.lab_3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class BezierDrawView1 extends View {
    Paint paint = new Paint() {
        {
            setStyle(Style.STROKE);
            setStrokeCap(Cap.ROUND);
            setStrokeWidth(3.0f);
            setAntiAlias(true);
        }
    };

    final Path path = new Path();

    public BezierDrawView1(Context context) {
        super(context);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(10);
    }

    public BezierDrawView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(10);
    }

    public BezierDrawView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(10);
    }

    @Override
    public void onDraw(Canvas canvas) {
        path.moveTo(0, 0);

        path.cubicTo(150, 150, 200, 0, 100, 100);
        canvas.drawPath(path, paint);
    }

}
