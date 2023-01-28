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

public class MuscleForearmsRightv2 extends AppCompatActivity {
    private VideoView forearmsright2;
    private Button Egzersiz3;
    private Button buton;
    private TextView textView;
    private Button buton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_forearms_rightv2);
        Egzersiz3 = findViewById(R.id.buttonforearmright2);
        forearmsright2= findViewById(R.id.videoView18);
        buton = findViewById(R.id.button2);
        textView=findViewById(R.id.rightforearms2);
        buton2 = findViewById(R.id.button3);


        String videoPath = "android.resource://"+ getPackageName() + "/" + + R.raw.forearmsright2;
        Uri uri = Uri.parse(videoPath);
        forearmsright2.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        forearmsright2.setMediaController(mediaController);
        mediaController.setAnchorView(forearmsright2);
        forearmsright2.start();

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
                startActivity(new Intent(MuscleForearmsRightv2.this , MuscleForearmsRightv3.class));
            }
        });
    }
}