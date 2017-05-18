package com.example.kp.lab_3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.util.AttributeSet;
import android.view.View;

public class CircleDrawView1 extends View {
    Paint paint = new Paint();
    public RadialGradient Gradient=secondpage.gradient;

    public CircleDrawView1(Context context) {
        super(context);
        paint.setColor(0xff947811);
        if (Gradient != null)
        paint.setShader(Gradient);
    }

    public CircleDrawView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(0xff947811);
        if (Gradient != null)
        paint.setShader(Gradient);
    }

    public CircleDrawView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint.setColor(0xff947811);
        if (Gradient != null)
        paint.setShader(Gradient);
    }


    @Override
    public void onDraw(Canvas canvas) {
        RadialGradient Gradient=secondpage.gradient;
        if (Gradient != null)
        paint.setShader(Gradient);
        canvas.drawCircle(150, 150, 100, paint);
    }

}
