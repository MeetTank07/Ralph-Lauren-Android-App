package com.example.ralph_lauren;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class shoes_catagory extends AppCompatActivity {

    ImageView S1,S2,S3,S4,S5,S6,S7,S8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shoes_catagory);

        S1=findViewById(R.id.S1);
        S2=findViewById(R.id.S2);
        S3=findViewById(R.id.S3);
        S4=findViewById(R.id.S4);
        S5=findViewById(R.id.S5);
        S6=findViewById(R.id.S6);
        S7=findViewById(R.id.S7);
        S8=findViewById(R.id.S8);

        S1.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sh1.class);
            startActivity(intent);
        });
        S2.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sh2.class);
            startActivity(intent);
        });
        S3.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sh3.class);
            startActivity(intent);
        });
        S4.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sh4.class);
            startActivity(intent);
        });
        S5.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sh5.class);
            startActivity(intent);
        });
        S6.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sh6.class);
            startActivity(intent);
        });
        S7.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sh7.class);
            startActivity(intent);
        });
        S8.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sh8.class);
            startActivity(intent);
        });
    }
}