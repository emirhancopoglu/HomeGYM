package com.example.muscle;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MuscleAbdominals3 extends AppCompatActivity {
    private VideoView abdominals3;
    private Button buton;
    private TextView textView;
    private Button buton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_abdominals3);

        abdominals3= findViewById(R.id.videoView46);
        buton = findViewById(R.id.button2);
        textView=findViewById(R.id.abdominals3);
        buton2 = findViewById(R.id.button3);


        String videoPath = "android.resource://"+ getPackageName() + "/" + + R.raw.abdominals3;
        Uri uri = Uri.parse(videoPath);
        abdominals3.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        abdominals3.setMediaController(mediaController);
        mediaController.setAnchorView(abdominals3);
        abdominals3.start();

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