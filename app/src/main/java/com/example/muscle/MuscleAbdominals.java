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

public class MuscleAbdominals extends AppCompatActivity {
    private VideoView abdominals;
    private Button Egzersiz2;
    private Button buton;
    private TextView textView;
    private Button buton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_abdominals);
        Egzersiz2 = findViewById(R.id.buttonabdominals1);
        abdominals= findViewById(R.id.videoView44);
        buton = findViewById(R.id.button2);
        textView=findViewById(R.id.abdominals1);
        buton2 = findViewById(R.id.button3);



        String videoPath = "android.resource://"+ getPackageName() + "/" + + R.raw.abdominals;
        Uri uri = Uri.parse(videoPath);
        abdominals.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        abdominals.setMediaController(mediaController);
        mediaController.setAnchorView(abdominals);
        abdominals.start();

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
                startActivity(new Intent(MuscleAbdominals.this , MuscleAbdominals2.class));
            }
        });
    }
}