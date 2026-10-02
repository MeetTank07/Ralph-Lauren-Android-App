package com.example.ralph_lauren;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Payment_method extends AppCompatActivity {
    RadioButton rbCOD, rbCard, rbOnline;

    Button Btncontinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_payment_method);

        rbCOD = findViewById(R.id.rbCOD);
        rbCard = findViewById(R.id.rbCard);
        rbOnline = findViewById(R.id.rbOnline);
        Btncontinue = findViewById(R.id.Btncontinue);

        rbCOD.setOnClickListener(v -> {
            rbCOD.setChecked(true);
            rbCard.setChecked(false);
            rbOnline.setChecked(false);
        });

// Card click
        rbCard.setOnClickListener(v -> {
            rbCOD.setChecked(false);
            rbCard.setChecked(true);
            rbOnline.setChecked(false);
        });

// Online click
        rbOnline.setOnClickListener(v -> {
            rbCOD.setChecked(false);
            rbCard.setChecked(false);
            rbOnline.setChecked(true);
        });

        Btncontinue.setOnClickListener(v -> {

            if (!rbCOD.isChecked() && !rbCard.isChecked() && !rbOnline.isChecked()) {
                Toast.makeText(this, "Please Select One Method", Toast.LENGTH_SHORT).show();
            }
            else {
                Intent intent = new Intent(this, Order_sucessful.class);
                startActivity(intent);
            }
        });
    }
}