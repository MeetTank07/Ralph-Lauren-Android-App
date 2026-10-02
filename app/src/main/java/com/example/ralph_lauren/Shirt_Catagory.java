package com.example.ralph_lauren;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Shirt_Catagory extends AppCompatActivity {

    ImageView Shirt1,Shirt2,Shirt3,Shirt4,Shirt5,Shirt6,Shirt7,Shirt8,Shirt9,Shirt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shirt_catagory);
        
        Shirt1=findViewById(R.id.Shirt1);
        Shirt2=findViewById(R.id.Shirt2);
        Shirt3=findViewById(R.id.Shirt3);
        Shirt4=findViewById(R.id.Shirt4);
        Shirt5=findViewById(R.id.Shirt5);
        Shirt6=findViewById(R.id.Shirt6);
        Shirt7=findViewById(R.id.Shirt7);
        Shirt8=findViewById(R.id.Shirt8);
        Shirt9=findViewById(R.id.Shirt9);
        Shirt10=findViewById(R.id.Shirt10);

        Shirt1.setOnClickListener(v -> {

            Intent inent=new Intent(this, Shirt1.class);
            startActivity(inent);
        });

        Shirt2.setOnClickListener(v -> {

            Intent inent=new Intent(this, Suit2.class);
            startActivity(inent);
        });

        Shirt3.setOnClickListener(v -> {

            Intent inent=new Intent(this, Shirt3.class);
            startActivity(inent);
        });

        Shirt4.setOnClickListener(v -> {

            Intent inent=new Intent(this, Shirt4.class);
            startActivity(inent);
        });
        Shirt5.setOnClickListener(v -> {

            Intent inent=new Intent(this, Shirt3.class);
            startActivity(inent);
        });

        Shirt6.setOnClickListener(v -> {

            Intent inent=new Intent(this, Shirt6.class);
            startActivity(inent);
        });
        Shirt7.setOnClickListener(v -> {

            Intent inent=new Intent(this, Shirt7.class);
            startActivity(inent);
        });

        Shirt8.setOnClickListener(v -> {

            Intent inent=new Intent(this, Suit8.class);
            startActivity(inent);
        });

        Shirt9.setOnClickListener(v -> {

            Intent inent=new Intent(this, Shirt9.class);
            startActivity(inent);
        });

        Shirt10.setOnClickListener(v -> {

            Intent inent=new Intent(this, Shirt10.class);
            startActivity(inent);
        });
        
    }
}