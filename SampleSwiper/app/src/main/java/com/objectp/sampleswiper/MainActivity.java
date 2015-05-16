package com.objectp.sampleswiper;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;


public class MainActivity extends ActionBarActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private TextView bucksMessage;
    private GestureDetector gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bucksMessage = (TextView)findViewById(R.id.buckysMessage);
        this.gestureDetector = new GestureDetector(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }
    /////////////////////START GESTURES////////////////////////
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        bucksMessage.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        bucksMessage.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        bucksMessage.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        bucksMessage.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        bucksMessage.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        bucksMessage.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        bucksMessage.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        bucksMessage.setText("onFling");
        return true;
    }
    /////////////////////END GESTURES////////////////////////

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }


}
