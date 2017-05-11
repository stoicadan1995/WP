package com.example.kp.lab2onpw;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button1;
    RelativeLayout main;
    Button button2;

    List<Integer> sizes = new ArrayList<>();

    ListView listView;
    Adapter adapter;

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_Q:
                button2.setBackgroundColor(0xff002349);

                break;
            case KeyEvent.KEYCODE_W:
                button2.setText("Changed Text");

                break;
        }

        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.changeButtonText:
                    button1.setText("Changed button");
                break;
            case R.id.changeTextBackground:

                button1.setBackgroundColor(0xff2374f1);

                break;
            case R.id.changeBackgroundColor:


                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                main.setBackgroundColor(color);



                break;
        }
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i < 50; i++){
            sizes.add(150 + i);
        }

        listView = (ListView) findViewById(R.id.listView);
        adapter = new Adapter(this);
        adapter.setData(sizes);
        listView.setAdapter(adapter);

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        main=(RelativeLayout)findViewById(R.id.main);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager inputMethodManager=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

                inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        MainActivity.this);
                builder.setMessage("Dialog!")
                        .setTitle("Dialog Title")
                        .setCancelable(false)
                        .setPositiveButton("Close",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                button2.setWidth(sizes.get(position));
            }
        });

    }
}
