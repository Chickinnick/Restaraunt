package com.nick.restaraunt.activities;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import com.nick.restaraunt.R;

import java.io.IOException;


public class MediaActivity extends Activity {


    private MediaPlayer mediaPlayer = new MediaPlayer();
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);


        Button buttonStart = (Button) findViewById(R.id.btn_play);
        Button buttonStop = (Button) findViewById(R.id.btn_stop);
        Button buttonStartVideo = (Button) findViewById(R.id.btn_start_video);


        videoView = (VideoView) findViewById(R.id.VideoView);
        videoView.setVideoPath("http://devimages.apple.com/iphone/samples/bipbop/bipbopall.m3u8");


        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });


        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
            }
        });


        buttonStartVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.start();
            }
        });


        String url = "http://cs7-1v4.vk-cdn.net/p18/2429d281ebfef8.mp3?extra=B1s7hncJtCQ4l79iOL2-LoRXvwkte-F091KukXj7FM8UHgsygvx9QgCjnrZsTS_szfxNN-0WBKsfR-Nq6aHSgBtEEKg1NxM,210"; // your URL here
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);


        try {
            mediaPlayer.setDataSource(url);
            mediaPlayer.prepare(); // might take long! (for buffering, etc)

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
