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

public class MuscleQuadleft2 extends AppCompatActivity {
    private VideoView quadleft2;
    private Button Egzersiz3;
    private Button buton;
    private TextView textView;
    private Button buton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_quadleft2);
        Egzersiz3 = findViewById(R.id.buttonQuadleft2);
        quadleft2= findViewById(R.id.videoView21);
        buton = findViewById(R.id.button2);
        textView=findViewById(R.id.leftquad2);
        buton2 = findViewById(R.id.button3);


        String videoPath = "android.resource://"+ getPackageName() + "/" + + R.raw.quadsleft2;
        Uri uri = Uri.parse(videoPath);
        quadleft2.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        quadleft2.setMediaController(mediaController);
        mediaController.setAnchorView(quadleft2);
        quadleft2.start();

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



        Egzersiz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MuscleQuadleft2.this , MuscleQuadleft3.class));
            }
        });
    }
}