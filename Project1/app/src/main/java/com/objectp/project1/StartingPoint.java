package com.objectp.project1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class StartingPoint extends ActionBarActivity {
    int counter;
    public Button add;
    public Button sub;
    public TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
        add = (Button) findViewById(R.id.bAdd);
        sub = (Button) findViewById(R.id.bSub);
        display = (TextView) findViewById(R.id.tvDisplay);
        //listen add button and take action
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                display.setText("Your total is: " + counter);//setText need to have quotation
            }
        });
        //listen subtract button and take action
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                display.setText("Your total is: " + counter);
            }
        });
    }

}
