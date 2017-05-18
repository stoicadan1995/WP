package com.example.kp.lab_3;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

public class OvalDrawView1 extends View {
    Paint paint = new Paint();
    public RadialGradient Gradient=secondpage.gradient2;

    public OvalDrawView1(Context context) {
        super(context);
        if (Gradient != null)
            paint.setShader(Gradient);
        paint.setColor(Color.MAGENTA);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(7);
    }

    public OvalDrawView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (Gradient != null)
            paint.setShader(Gradient);
        paint.setColor(Color.MAGENTA);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(7);
    }

    public OvalDrawView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (Gradient != null)
            paint.setShader(Gradient);
        paint.setColor(Color.MAGENTA);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(7);
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onDraw(Canvas canvas) {
        RadialGradient Gradient=secondpage.gradient2;
        if (Gradient != null)
            paint.setShader(Gradient);

        canvas.drawOval(20, 20, 300, 125, paint);
    }

}
