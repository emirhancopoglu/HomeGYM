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

public class MuscleCalvesRight extends AppCompatActivity {
    private VideoView calvesright;
    private Button Egzersiz2;
    private Button buton;
    private TextView textView;
    private Button buton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_calves_right);
        Egzersiz2 = findViewById(R.id.buttoncalvesright1);
        calvesright= findViewById(R.id.videoView41);
        buton = findViewById(R.id.button2);
        textView=findViewById(R.id.rightcalves1);
        buton2 = findViewById(R.id.button3);


        String videoPath = "android.resource://"+ getPackageName() + "/" + + R.raw.calvesright;
        Uri uri = Uri.parse(videoPath);
        calvesright.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        calvesright.setMediaController(mediaController);
        mediaController.setAnchorView(calvesright);
        calvesright.start();

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
                startActivity(new Intent(MuscleCalvesRight.this , MuscleCalvesRight2.class));
            }
        });
    }
}