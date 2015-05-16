package com.objectp.project1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;

/**
 * Created by ethiotech on 4/11/2015.
 */
public class Splash extends Activity {
    MediaPlayer ourSong;
    @Override
    protected void onCreate(Bundle TravisLoveBacon) {
        super.onCreate(TravisLoveBacon);
        setContentView(R.layout.splash);
        ourSong = MediaPlayer.create(Splash.this,R.raw.splashsound);
        SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        boolean music = getPrefs.getBoolean("checkbox",true);
        if(music == true){
            ourSong.start();
        }

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent openStartingPoint = new Intent("com.objectp.project0.MENU");
                    startActivity(openStartingPoint);
                }
            }
        };

        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ourSong.release();
        finish();//finishes the splash activity
    }
}
