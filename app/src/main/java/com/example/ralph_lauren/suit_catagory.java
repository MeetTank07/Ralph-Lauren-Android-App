package com.example.ralph_lauren;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class suit_catagory extends AppCompatActivity {

    ImageView Suit1,Suit2,Suit3,Suit4,Suit5,Suit6,Suit7,Suit8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_suit_catagory);

        Suit1=findViewById(R.id.Suit1);
        Suit2=findViewById(R.id.Suit2);
        Suit3=findViewById(R.id.Suit3);
        Suit4=findViewById(R.id.Suit4);
        Suit5=findViewById(R.id.Suit5);
        Suit6=findViewById(R.id.Suit6);
        Suit7=findViewById(R.id.Suit7);
        Suit8=findViewById(R.id.Suit8);


        Suit1.setOnClickListener(v -> {

            Intent inent=new Intent(this, suit1.class);
            startActivity(inent);
        });

        Suit2.setOnClickListener(v -> {

            Intent inent=new Intent(this, Suit2.class);
            startActivity(inent);
        });

        Suit3.setOnClickListener(v -> {

            Intent inent=new Intent(this, Suit3.class);
            startActivity(inent);
        });

        Suit4.setOnClickListener(v -> {

            Intent inent=new Intent(this, Suit4.class);
            startActivity(inent);
        });
        Suit5.setOnClickListener(v -> {

            Intent inent=new Intent(this, Suit5.class);
            startActivity(inent);
        });

        Suit6.setOnClickListener(v -> {

            Intent inent=new Intent(this, Suit6.class);
            startActivity(inent);
        });
        Suit7.setOnClickListener(v -> {

            Intent inent=new Intent(this, Suit7.class);
            startActivity(inent);
        });

        Suit8.setOnClickListener(v -> {

            Intent inent=new Intent(this, Suit8.class);
            startActivity(inent);
        });
    }
}