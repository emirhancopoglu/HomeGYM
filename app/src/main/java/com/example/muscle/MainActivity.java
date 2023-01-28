package com.example.muscle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
  private  ImageView imaj;
  private Button butonShoulder;
  private Button butonShoulder2;
  private Button butonChest;
  private Button butonBiceps;
  private Button butonBiceps2;
  private Button butonForearmsleft;
  private Button butonForearmsright;
  private Button butonQuadsleft;
  private Button butonQuadsright;
  private Button buttonObliquesleft;
  private Button buttonObliquesright;
  private Button buttontrapsleft;
  private Button buttontrapsright;
  private Button buttonCalvesLeft;
  private Button buttoncalvesright;
  private Button buttonabdominals;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imaj;
        imaj = findViewById(R.id.imageViewbody);
        butonShoulder = findViewById(R.id.buttonbir);
        butonShoulder2 = findViewById(R.id.buttoniki);
        butonChest = findViewById(R.id.buttonuc);
        butonBiceps = findViewById(R.id.buttonBiceps);
        butonBiceps2 = findViewById(R.id.buttonBicepsv2);
        butonForearmsleft = findViewById(R.id.buttonforearmsleft);
        butonForearmsright = findViewById(R.id.buttonforearmsright);
        butonQuadsleft = findViewById(R.id.buttonquadleft);
        butonQuadsright = findViewById(R.id.buttonquadright);
        buttonObliquesleft = findViewById(R.id.buttonObliquesleft);
        buttonObliquesright=findViewById(R.id.buttonObliquesright);
        buttontrapsleft=findViewById(R.id.buttontrapsleft);
        buttontrapsright=findViewById(R.id.buttontrapsright);
        buttonCalvesLeft=findViewById(R.id.buttoncalvesleft);
        buttoncalvesright=findViewById(R.id.buttoncalvesright);
        buttonabdominals=findViewById(R.id.buttonabdominals);





        butonShoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MuscleShoulder.class));
            }
        });

        butonShoulder2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MuscleShoulder2.class));

            }
        });

        butonChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MuscleChest.class));
            }
        });

        butonBiceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MuscleBiceps.class));
            }
        });
        butonBiceps2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MuscleBicepsv2.class));
            }
        });

        butonForearmsleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MuscleForearms.class));
            }
        });
        butonForearmsright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MuscleForearmsRight.class));
            }
        });
        butonQuadsleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MuscleQuadleft.class));

            }
        });
        butonQuadsright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MuscleQuadRight.class));

            }

        });
        buttonObliquesleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this , MuscleObliquesLeft.class));
            }
        });
        buttonObliquesright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this , MuscleObliquesRight.class));
            }
        });
        buttontrapsleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this , MuscleTrapsLeft.class));
            }
        });
        buttontrapsright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this , MuscleTrapsRight.class));
            }
        });
        buttonCalvesLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this , MuscleCalvesLeft.class));
            }
        });
        buttoncalvesright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this , MuscleCalvesRight.class));
            }
        });
        buttonabdominals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this , MuscleAbdominals.class));
            }
        });
    }}