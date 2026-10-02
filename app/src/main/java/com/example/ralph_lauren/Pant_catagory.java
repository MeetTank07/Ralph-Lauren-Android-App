package com.example.ralph_lauren;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pant_catagory extends AppCompatActivity {
    ImageView pant1,pant2,pant3,pant4,pant5,pant6,pant7,pant8,pant9,pant10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pant_catagory);

        pant1=findViewById(R.id.pant1);
        pant2=findViewById(R.id.pant2);
        pant3=findViewById(R.id.pant3);
        pant4=findViewById(R.id.pant4);
        pant5=findViewById(R.id.pant5);
        pant6=findViewById(R.id.pant6);
        pant7=findViewById(R.id.pant7);
        pant8=findViewById(R.id.pant8);
        pant9=findViewById(R.id.pant9);
        pant10=findViewById(R.id.pant10);

        pant1.setOnClickListener(v -> {

            Intent inent=new Intent(this, Pant1.class);
            startActivity(inent);
        });

        pant2.setOnClickListener(v -> {

            Intent inent=new Intent(this, Pant2.class);
            startActivity(inent);
        });

        pant3.setOnClickListener(v -> {

            Intent inent=new Intent(this, Pant3.class);
            startActivity(inent);
        });

        pant4.setOnClickListener(v -> {

            Intent inent=new Intent(this, Pant4.class);
            startActivity(inent);
        });
        pant5.setOnClickListener(v -> {

            Intent inent=new Intent(this, Pant5.class);
            startActivity(inent);
        });

        pant6.setOnClickListener(v -> {

            Intent inent=new Intent(this, Pant6.class);
            startActivity(inent);
        });
        pant7.setOnClickListener(v -> {

            Intent inent=new Intent(this, Pant7.class);
            startActivity(inent);
        });

        pant8.setOnClickListener(v -> {

            Intent inent=new Intent(this, Pant8.class);
            startActivity(inent);
        });

        pant9.setOnClickListener(v -> {

            Intent inent=new Intent(this, Pant9.class);
            startActivity(inent);
        });

        pant10.setOnClickListener(v -> {

            Intent inent=new Intent(this, Pant10.class);
            startActivity(inent);
        });
    }
}