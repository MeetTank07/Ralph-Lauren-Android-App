package com.example.ralph_lauren;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Coat_catagory extends AppCompatActivity {

    ImageView C1,C2,C3,C4,C5,C6,C7,C8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coat_catagory);

        C1=findViewById(R.id.C1);
        C2=findViewById(R.id.C2);
        C3=findViewById(R.id.C3);
        C4=findViewById(R.id.C4);
        C5=findViewById(R.id.C5);
        C6=findViewById(R.id.C6);
        C7=findViewById(R.id.C7);
        C8=findViewById(R.id.C8);

        C1.setOnClickListener(v -> {
            Intent intent=new Intent(this, Coat1.class);
            startActivity(intent);
        });
        C2.setOnClickListener(v -> {
            Intent intent=new Intent(this, Coat2.class);
            startActivity(intent);
        });
        C3.setOnClickListener(v -> {
            Intent intent=new Intent(this, Coat3.class);
            startActivity(intent);
        });
        C4.setOnClickListener(v -> {
            Intent intent=new Intent(this, Coat4.class);
            startActivity(intent);
        });
        C5.setOnClickListener(v -> {
            Intent intent=new Intent(this, Coat5.class);
            startActivity(intent);
        });
        C6.setOnClickListener(v -> {
            Intent intent=new Intent(this, Coat6.class);
            startActivity(intent);
        });
        C7.setOnClickListener(v -> {
            Intent intent=new Intent(this, Coat7.class);
            startActivity(intent);
        });
        C8.setOnClickListener(v -> {
            Intent intent=new Intent(this, Coat8.class);
            startActivity(intent);
        });
    }
}