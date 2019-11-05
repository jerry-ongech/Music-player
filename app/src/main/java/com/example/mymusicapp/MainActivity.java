package com.example.mymusicapp;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button play,pause,rewind,forward;
MediaPlayer mediaPlayer;
int pausePosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play=(Button)findViewById(R.id.play);
        pause=(Button)findViewById(R.id.pause);
        forward=(Button)findViewById(R.id.forward);
        rewind=(Button)findViewById(R.id.rewind);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        forward.setOnClickListener(this);
        rewind.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.play:
                if (mediaPlayer==null) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ocarina);
                    mediaPlayer.start();
                    break;
                }
                else if (!mediaPlayer.isPlaying()){
                    mediaPlayer.seekTo(pausePosition);
                    mediaPlayer.start();
                }
            case R.id.pause:
                if (mediaPlayer==null){
                mediaPlayer.pause();
                mediaPlayer=null;
                pausePosition=mediaPlayer.getCurrentPosition();
                }
                break;
            case R.id.rewind:
                if (mediaPlayer==null) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ocarina);
                    mediaPlayer.start();
                    break;
                }    }
        }
    }

