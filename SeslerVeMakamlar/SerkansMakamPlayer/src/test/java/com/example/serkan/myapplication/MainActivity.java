package com.example.serkan.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button bplay;
    Button bpause;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        LinearLayout linearLayout = new LinearLayout(this);

        bplay = new Button(this);
        bplay.setText("Play");
        bplay.setOnClickListener(this);

        bpause = new Button(this);
        bpause.setText("Pause");
        bpause.setOnClickListener(this);

        linearLayout.addView(bplay);
        linearLayout.addView(bpause);


        mediaPlayer = MediaPlayer.create(this, R.raw.muhayyer);

        // mediaPlayer.setLooping(true);

        mediaPlayer.start();

        /*
        try {
            new Thread().sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

        //mediaPlayer.stop();

    }

    @Override
    public void onClick(View view) {

        if(view == bplay) {
            mediaPlayer.start();
        } else if(view == bpause) {
            mediaPlayer.stop();
        }

    }
}
