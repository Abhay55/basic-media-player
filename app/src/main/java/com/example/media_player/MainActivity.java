package com.example.media_player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button play,pause,stop,ff,fb;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play=findViewById(R.id.play);
        pause=findViewById(R.id.pause);
        stop=findViewById(R.id.stop);
        ff=findViewById(R.id.ff);
        fb=findViewById(R.id.fb);

         mp = MediaPlayer.create(MainActivity.this, R.raw.song);
         //  String path= Environment.getExternalStorageDirectory().getAbsolutePath()+"path of folder"
         //mp.setDataSource(path );
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();

            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.pause();

            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.stop();

            }
        });

        ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int cp=mp.getCurrentPosition();
                mp.seekTo(cp+5000);

            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int cp=mp.getCurrentPosition();
                mp.seekTo(cp-5000);
            }
        });






    }
}
