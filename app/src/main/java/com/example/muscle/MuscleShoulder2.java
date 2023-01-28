package com.example.muscle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MuscleShoulder2 extends AppCompatActivity {
    private VideoView leftshoulder;
    private Button Egzersiz2;
    private Button buton;
    private TextView textView;
    private Button buton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_shoulder2);
        Egzersiz2 = findViewById(R.id.buttonEgzersiz3);
        leftshoulder= findViewById(R.id.videoView);
        buton = findViewById(R.id.button2);
        textView=findViewById(R.id.shoulder2);
        buton2 = findViewById(R.id.button3);

        String videoPath = "android.resource://"+ getPackageName() + "/" + + R.raw.rightshoulder;
        Uri uri = Uri.parse(videoPath);
        leftshoulder.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        leftshoulder.setMediaController(mediaController);
        mediaController.setAnchorView(leftshoulder);
        leftshoulder.start();

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


        Egzersiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MuscleShoulder2.this, Egzersiz2.class));
            }
        });


    }
}