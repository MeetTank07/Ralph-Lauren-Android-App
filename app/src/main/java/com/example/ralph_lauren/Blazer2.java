package com.example.ralph_lauren;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Blazer2 extends AppCompatActivity {
    Button payment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_blazer2);

        payment1 = findViewById(R.id.payment1);

        payment1.setOnClickListener(view -> {
            Intent intent = new Intent(this, Payment_method.class);
            startActivity(intent);
        });
    }
}