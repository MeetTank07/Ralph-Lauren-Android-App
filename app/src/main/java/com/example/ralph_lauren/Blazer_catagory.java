package com.example.ralph_lauren;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Blazer_catagory extends AppCompatActivity {

    ImageView Blazer1,Blazer2,Blazer3,Blazer4,Blazer5,Blazer6,Blazer7,Blazer8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_blazer_catagory);
        Blazer1=findViewById(R.id.Blazer1);
        Blazer2=findViewById(R.id.Blazer2);
        Blazer3=findViewById(R.id.Blazer3);
        Blazer4=findViewById(R.id.Blazer4);
        Blazer5=findViewById(R.id.Blazer5);
        Blazer6=findViewById(R.id.Blazer6);
        Blazer7=findViewById(R.id.Blazer7);
        Blazer8=findViewById(R.id.Blazer8);

        Blazer1.setOnClickListener(v -> {
            Intent intent=new Intent(this, blazer1.class);
            startActivity(intent);
        });
        Blazer2.setOnClickListener(v -> {
            Intent intent=new Intent(this, Blazer2.class);
            startActivity(intent);
        });
        Blazer3.setOnClickListener(v -> {
            Intent intent=new Intent(this, Blazer3.class);
            startActivity(intent);
        });
        Blazer4.setOnClickListener(v -> {
            Intent intent=new Intent(this, Blazer4.class);
            startActivity(intent);
        });
        Blazer5.setOnClickListener(v -> {
            Intent intent=new Intent(this, Blazer5.class);
            startActivity(intent);
        });
        Blazer6.setOnClickListener(v -> {
            Intent intent=new Intent(this, Blazer6.class);
            startActivity(intent);
        });
        Blazer7.setOnClickListener(v -> {
            Intent intent=new Intent(this, Blazer7.class);
            startActivity(intent);
        });
        Blazer8.setOnClickListener(v -> {
            Intent intent=new Intent(this, Blazer8.class);
            startActivity(intent);
        });

    }
}