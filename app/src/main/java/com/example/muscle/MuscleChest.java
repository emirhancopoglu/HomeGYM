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

public class MuscleChest extends AppCompatActivity {

    private VideoView chest;
    private Button Egzersiz2;
    private Button buton;
    private TextView textView;
    private Button buton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_chest);

        Egzersiz2 = findViewById(R.id.buttonEgzersiz4);
        chest= findViewById(R.id.videoView5);
        buton = findViewById(R.id.button2);
        textView=findViewById(R.id.chesttext);
        buton2 = findViewById(R.id.button3);


        String videoPath = "android.resource://"+ getPackageName() + "/" + + R.raw.gogus;
        Uri uri = Uri.parse(videoPath);
        chest.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        chest.setMediaController(mediaController);
        mediaController.setAnchorView(chest);
        chest.start();

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
                startActivity(new Intent(MuscleChest.this, MuscleEgzersiz2.class));
            }
        });
    }
}