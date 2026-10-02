package com.example.ralph_lauren;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tshirt extends AppCompatActivity {

    ImageView T1,T2,T3,T4,T5,T6,T7,T8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tshirt);

        T1=findViewById(R.id.T1);
        T2=findViewById(R.id.T2);
        T3=findViewById(R.id.T3);
        T4=findViewById(R.id.T4);
        T5=findViewById(R.id.T5);
        T6=findViewById(R.id.T6);
        T7=findViewById(R.id.T7);
        T8=findViewById(R.id.T8);

        T1.setOnClickListener(v -> {
            Intent intent=new Intent(this, Tsirt1.class);
            startActivity(intent);
        });
        T2.setOnClickListener(v -> {
            Intent intent=new Intent(this, Tsirt2.class);
            startActivity(intent);
        });
        T3.setOnClickListener(v -> {
            Intent intent=new Intent(this, Tsirt3.class);
            startActivity(intent);
        });
        T4.setOnClickListener(v -> {
            Intent intent=new Intent(this, Tsirt4.class);
            startActivity(intent);
        });
        T5.setOnClickListener(v -> {
            Intent intent=new Intent(this, Tsirt5.class);
            startActivity(intent);
        });
        T6.setOnClickListener(v -> {
            Intent intent=new Intent(this, Tsirt6.class);
            startActivity(intent);
        });
        T7.setOnClickListener(v -> {
            Intent intent=new Intent(this, Tsirt7.class);
            startActivity(intent);
        });
        T8.setOnClickListener(v -> {
            Intent intent=new Intent(this, Tsirt8.class);
            startActivity(intent);
        });

    }
}