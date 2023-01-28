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

public class MuscleBicepsv3 extends AppCompatActivity {
    private VideoView biceps5;
    private Button Egzersiz3;
    private Button buton;
    private TextView textView;
    private Button buton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_bicepsv3);
        Egzersiz3 = findViewById(R.id.buttonRightBicepsv2);
        biceps5= findViewById(R.id.videoView12);
        buton = findViewById(R.id.button2);
        textView=findViewById(R.id.rightbiceps2);
        buton2 = findViewById(R.id.button3);


        String videoPath = "android.resource://"+ getPackageName() + "/" + + R.raw.biceps2right;
        Uri uri = Uri.parse(videoPath);
        biceps5.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        biceps5.setMediaController(mediaController);
        mediaController.setAnchorView(biceps5);
        biceps5.start();

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
                startActivity(new Intent(MuscleBicepsv3.this , MuscleBicepsv4.class));

            }
        });
    }
}