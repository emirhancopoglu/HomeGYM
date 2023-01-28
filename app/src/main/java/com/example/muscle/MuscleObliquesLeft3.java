package com.example.muscle;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MuscleObliquesLeft3 extends AppCompatActivity {
    private VideoView obliquesleft3;
    private Button buton;
    private TextView textView;
    private Button buton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_obliques_left3);

        obliquesleft3= findViewById(R.id.videoView28);
        buton = findViewById(R.id.button2);
        textView=findViewById(R.id.leftoblique3);
        buton2 = findViewById(R.id.button3);


        String videoPath = "android.resource://"+ getPackageName() + "/" + + R.raw.obliqueleft3;
        Uri uri = Uri.parse(videoPath);
        obliquesleft3.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        obliquesleft3.setMediaController(mediaController);
        mediaController.setAnchorView(obliquesleft3);
        obliquesleft3.start();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(view.VISIBLE);

                buton.setVisibility(view.GONE);
                buton2.setVisibility(view.VISIBLE);
            }
        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buton.setVisibility(view.VISIBLE);
                buton2.setVisibility(view.GONE);
                textView.setVisibility(view.GONE);

            }
        });

    }
}