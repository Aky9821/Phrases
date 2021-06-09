package com.aky.phrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFxn(View v) {
        Button buttonPressed = (Button)v;
        Log.i("Click",buttonPressed.getTag().toString());
        MediaPlayer mediaPlayer= MediaPlayer.create(this,getResources().getIdentifier(buttonPressed.getTag().toString(),"raw",getPackageName()));
        mediaPlayer.start();
    }
}