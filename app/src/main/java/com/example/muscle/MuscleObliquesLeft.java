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

public class MuscleObliquesLeft extends AppCompatActivity {
    private VideoView obliquesleft;
    private Button Egzersiz2;
    private Button buton;
    private TextView textView;
    private Button buton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_obliques_left);
        Egzersiz2 = findViewById(R.id.buttonoblique1);
        obliquesleft= findViewById(R.id.videoView26);
        buton = findViewById(R.id.button2);
        textView=findViewById(R.id.leftoblique1);
        buton2 = findViewById(R.id.button3);


        String videoPath = "android.resource://"+ getPackageName() + "/" + + R.raw.obliquesleft;
        Uri uri = Uri.parse(videoPath);
        obliquesleft.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        obliquesleft.setMediaController(mediaController);
        mediaController.setAnchorView(obliquesleft);
        obliquesleft.start();

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
                startActivity(new Intent(MuscleObliquesLeft.this, MuscleObliquesLeft2.class));
            }
        });
    }
}