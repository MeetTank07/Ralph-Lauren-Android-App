package com.example.ralph_lauren;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Order_sucessful extends AppCompatActivity {
    Button btnContinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_order_sucessful);

        btnContinue = findViewById(R.id.btnContinue);
        btnContinue.setOnClickListener(v -> {
            Intent intent=new Intent(this, Product_catagory.class);
            startActivity(intent);
        });
        }
    }
