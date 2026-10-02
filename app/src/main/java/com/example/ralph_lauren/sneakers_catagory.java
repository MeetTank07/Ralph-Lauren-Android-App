package com.example.ralph_lauren;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class sneakers_catagory extends AppCompatActivity {

    ImageView N1,N2,N3,N4,N5,N6,N7,N8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sneakers_catagory);

        N1=findViewById(R.id.N1);
        N2=findViewById(R.id.N2);
        N3=findViewById(R.id.N3);
        N4=findViewById(R.id.N4);
        N5=findViewById(R.id.N5);
        N6=findViewById(R.id.N6);
        N7=findViewById(R.id.N7);
        N8=findViewById(R.id.N8);

        N1.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sn1.class);
            startActivity(intent);
        });
        N2.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sn2.class);
            startActivity(intent);
        });
        N3.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sn3.class);
            startActivity(intent);
        });
        N4.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sn4.class);
            startActivity(intent);
        });
        N5.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sn5.class);
            startActivity(intent);
        });
        N6.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sn6.class);
            startActivity(intent);
        });
        N7.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sn7.class);
            startActivity(intent);
        });
        N8.setOnClickListener(v -> {
            Intent intent=new Intent(this, Sn8.class);
            startActivity(intent);
        });
    }
}