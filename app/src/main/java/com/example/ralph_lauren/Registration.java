package com.example.ralph_lauren;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.HashMap;

public class Registration extends AppCompatActivity {

    EditText edtName,edtMono,edtEmail,edtPass;

    Button btnSave;
    private FirebaseAuth mAuth;

    TextView loginhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration);

        mAuth = FirebaseAuth.getInstance();




        edtName=findViewById(R.id.edtName);
        edtMono=findViewById(R.id.edtMono);
        edtEmail=findViewById(R.id.edtEmail);
        edtPass=findViewById(R.id.edtPass);

        btnSave=findViewById(R.id.btnSave);
        loginhere=findViewById(R.id.loginhere);

        btnSave.setOnClickListener(v -> {
            String emiails=edtEmail.getText().toString().trim();
            String passwords=edtPass.getText().toString().trim();
            String name=edtName.getText().toString().trim();
            String mono=edtMono.getText().toString().trim();


            if(emiails.isEmpty() || passwords.isEmpty() || name.isEmpty() || mono.isEmpty()){
                Toast.makeText(this, "Please enter All Details", Toast.LENGTH_SHORT).show();
            } else {


                mAuth.createUserWithEmailAndPassword(emiails, passwords)
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    Log.d("fffff", "createUserWithEmail:success");
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    // updateUI(user);
                                    Toast.makeText(Registration.this, "Registration Successful.",
                                            Toast.LENGTH_SHORT).show();

                                    Intent intent = new Intent(Registration.this, Product_catagory.class);
                                    startActivity(intent);
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Log.w("ggggg", "createUserWithEmail:failure", task.getException());
                                    Toast.makeText(Registration.this, "Registration failed.",
                                            Toast.LENGTH_SHORT).show();
                                    // updateUI(null);
                                }
                            }
                        });
            }






        });

        loginhere.setOnClickListener(v -> {
            Intent intent=new Intent(this,Login.class);
            startActivity(intent);
        });


    }
}