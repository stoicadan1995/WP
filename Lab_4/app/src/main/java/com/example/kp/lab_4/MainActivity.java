package com.example.kp.lab_4;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    CircleDrawView circle;
    OvalDrawView oval;
    RectangleDrawView rectangle;
    SquareDrawView square;
    SquareDrawView1 square1;
    Button playbutt;

    Timer t;
    Integer animationSpeed = 300;

    int width;
    int height;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        circle=(CircleDrawView)findViewById(R.id.circle);
        rectangle=(RectangleDrawView)findViewById(R.id.rectangle);
        oval=(OvalDrawView)findViewById(R.id.oval);
        square=(SquareDrawView)findViewById(R.id.square);
        square1=(SquareDrawView1)findViewById(R.id.square1);
        playbutt=(Button)findViewById(R.id.playbutt);

        Display display = getWindowManager().getDefaultDisplay();
        Point size_of_screen = new Point();
        display.getSize(size_of_screen);
        width = size_of_screen.x;
        height = size_of_screen.y;

        t = new java.util.Timer();
        playbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Random r = new Random();

                                int x_for_circle = r.nextInt(width - 350);
                                int y_for_circle = r.nextInt(height - 350);

                                int x_for_rectangle = r.nextInt(width - 350);
                                int y_for_rectangle = r.nextInt(height - 350);

                                int x_for_oval = r.nextInt(width - 350);
                                int y_for_oval = r.nextInt(height - 350);

                                int x_for_square = r.nextInt(width - 350);
                                int y_for_square = r.nextInt(height - 350);

                                int x_for_square_1 = r.nextInt(width - 350);
                                int y_for_square_1 = r.nextInt(height - 350);

                                circle.animate().x(x_for_circle).setDuration(animationSpeed);
                                circle.animate().y(y_for_circle).setDuration(animationSpeed);

                                rectangle.animate().x(x_for_rectangle).setDuration(animationSpeed);
                                rectangle.animate().y(y_for_rectangle).setDuration(animationSpeed);

                                oval.animate().x(x_for_oval).setDuration(animationSpeed);
                                oval.animate().y(y_for_oval).setDuration(animationSpeed);

                                square.animate().x(x_for_square).setDuration(animationSpeed);
                                square.animate().y(y_for_square).setDuration(animationSpeed);

                                square1.animate().x(x_for_square_1).setDuration(animationSpeed);
                                square1.animate().y(y_for_square_1).setDuration(animationSpeed);
                            }
                        });
                    }
                }, 0, animationSpeed + 50);


            }
        });
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_VOLUME_DOWN)){
            animationSpeed -= 20;
            t.cancel();
            t = new java.util.Timer();
            t.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Random r = new Random();

                            int x_for_circle = r.nextInt(width - 350);
                            int y_for_circle = r.nextInt(height - 350);

                            int x_for_rectangle = r.nextInt(width - 350);
                            int y_for_rectangle = r.nextInt(height - 350);

                            int x_for_oval = r.nextInt(width - 350);
                            int y_for_oval = r.nextInt(height - 350);

                            int x_for_square = r.nextInt(width - 350);
                            int y_for_square = r.nextInt(height - 350);

                            int x_for_square_1 = r.nextInt(width - 350);
                            int y_for_square_1 = r.nextInt(height - 350);

                            circle.animate().x(x_for_circle).setDuration(animationSpeed);
                            circle.animate().y(y_for_circle).setDuration(animationSpeed);

                            rectangle.animate().x(x_for_rectangle).setDuration(animationSpeed);
                            rectangle.animate().y(y_for_rectangle).setDuration(animationSpeed);

                            oval.animate().x(x_for_oval).setDuration(animationSpeed);
                            oval.animate().y(y_for_oval).setDuration(animationSpeed);

                            square.animate().x(x_for_square).setDuration(animationSpeed);
                            square.animate().y(y_for_square).setDuration(animationSpeed);

                            square1.animate().x(x_for_square_1).setDuration(animationSpeed);
                            square1.animate().y(y_for_square_1).setDuration(animationSpeed);
                        }
                    });
                }
            }, 0, animationSpeed + 50);
        }
        else if ((keyCode == KeyEvent.KEYCODE_VOLUME_UP)){
            animationSpeed += 20;
            t.cancel();
            t = new java.util.Timer();
            t.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Random r = new Random();

                            int x_for_circle = r.nextInt(width - 350);
                            int y_for_circle = r.nextInt(height - 350);

                            int x_for_rectangle = r.nextInt(width - 350);
                            int y_for_rectangle = r.nextInt(height - 350);

                            int x_for_oval = r.nextInt(width - 350);
                            int y_for_oval = r.nextInt(height - 350);

                            int x_for_square = r.nextInt(width - 350);
                            int y_for_square = r.nextInt(height - 350);

                            int x_for_square_1 = r.nextInt(width - 350);
                            int y_for_square_1 = r.nextInt(height - 350);

                            circle.animate().x(x_for_circle).setDuration(animationSpeed);
                            circle.animate().y(y_for_circle).setDuration(animationSpeed);

                            rectangle.animate().x(x_for_rectangle).setDuration(animationSpeed);
                            rectangle.animate().y(y_for_rectangle).setDuration(animationSpeed);

                            oval.animate().x(x_for_oval).setDuration(animationSpeed);
                            oval.animate().y(y_for_oval).setDuration(animationSpeed);

                            square.animate().x(x_for_square).setDuration(animationSpeed);
                            square.animate().y(y_for_square).setDuration(animationSpeed);

                            square1.animate().x(x_for_square_1).setDuration(animationSpeed);
                            square1.animate().y(y_for_square_1).setDuration(animationSpeed);
                        }
                    });
                }
            }, 0, animationSpeed + 50);
        }
        return true;
    }
}
