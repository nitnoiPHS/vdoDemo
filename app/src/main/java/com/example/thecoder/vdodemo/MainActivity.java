package com.example.thecoder.vdodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vdoView = (VideoView) findViewById(R.id.videoView);
        vdoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.demovideo);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vdoView);

        vdoView.setMediaController(mediaController);
        vdoView.start();
    }
}
