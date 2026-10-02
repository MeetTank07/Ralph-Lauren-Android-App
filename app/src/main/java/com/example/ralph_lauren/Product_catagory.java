package com.example.ralph_lauren;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Product_catagory extends AppCompatActivity {

    ImageView imgsuitcat,imgblazercat,imgshirtcat,pantcatagory,Tsirt,Coat,Shoes,Snickers,welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_catagory);

        imgsuitcat=findViewById(R.id.imgsuitcat);
        imgblazercat=findViewById(R.id.imgblazercat);
        imgshirtcat=findViewById(R.id.imgshirtcat);
        pantcatagory=findViewById(R.id.pantcatagory);
        Tsirt=findViewById(R.id.Tsirt);
        Coat=findViewById(R.id.Coat);
        Shoes=findViewById(R.id.Shoes);
        Snickers=findViewById(R.id.Snickers);
        welcome=findViewById(R.id.welcome);

        imgsuitcat.setOnClickListener(v -> {
            Intent intent=new Intent(this,suit_catagory.class);
            startActivity(intent);
        });

        imgblazercat.setOnClickListener(v -> {
            Intent intent=new Intent(this, Blazer_catagory.class);
            startActivity(intent);
        });

        imgshirtcat.setOnClickListener(v ->{
                Intent intent=new Intent(this, Shirt_Catagory.class);
            startActivity(intent);
        });

        pantcatagory.setOnClickListener(v1 -> {
            Intent intent=new Intent(this, Pant_catagory.class);
            startActivity(intent);
        });

        Tsirt.setOnClickListener(v1 -> {
            Intent intent=new Intent(this, tshirt.class);
            startActivity(intent);
        });

        Coat.setOnClickListener(v1 -> {
            Intent intent=new Intent(this, Coat_catagory.class);
            startActivity(intent);
        });

        Shoes.setOnClickListener(v1 -> {
            Intent intent=new Intent(this, shoes_catagory.class);
            startActivity(intent);
        });

        Snickers.setOnClickListener(v1 -> {
            Intent intent=new Intent(this, sneakers_catagory.class);
            startActivity(intent);
        });
        welcome.setOnClickListener(v -> {
            Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        });
    }
}