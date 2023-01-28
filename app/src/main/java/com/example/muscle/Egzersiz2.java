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

public class Egzersiz2 extends AppCompatActivity {
    private VideoView rightshoulder;
    private Button egzersiz3;
    private Button buton;
    private TextView textView;
    private Button buton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egzersiz2);
        egzersiz3 = findViewById(R.id.buttonEgzersiz3);
        rightshoulder= findViewById(R.id.videoView3);
        buton = findViewById(R.id.button2);
        textView=findViewById(R.id.shoulder3);
        buton2 = findViewById(R.id.button3);

        String videoPath = "android.resource://"+ getPackageName() + "/" + + R.raw.egzersiz2;
        Uri uri = Uri.parse(videoPath);
        rightshoulder.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        rightshoulder.setMediaController(mediaController);
        mediaController.setAnchorView(rightshoulder);
        rightshoulder.start();
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

        egzersiz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Egzersiz2.this, Egzersiz3.class));
            }
        });
    }
}