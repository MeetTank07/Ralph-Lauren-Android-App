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

public class Login extends AppCompatActivity {

    EditText edtMobileno,edtpassword;

    Button btnLogin;
    private FirebaseAuth mAuth;
    TextView createacc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
        edtMobileno=findViewById(R.id.edtMobileno);
        edtpassword=findViewById(R.id.edtPassword);

        btnLogin=findViewById(R.id.btnLogin);


        createacc=findViewById(R.id.createacc);

        btnLogin.setOnClickListener(v -> {
            String emiails=edtMobileno.getText().toString().trim();
            String passwords=edtpassword.getText().toString().trim();

            if(emiails.isEmpty() || passwords.isEmpty()){
                Toast.makeText(this, "Please enter Email and Password", Toast.LENGTH_SHORT).show();
            } else {

                Intent intent = new Intent(Login.this, Product_catagory.class);
                startActivity(intent);



//                mAuth.signInWithEmailAndPassword(emiails, passwords)
//                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                if (task.isSuccessful()) {
//                                    // Sign in success, update UI with the signed-in user's information
//                                    Log.d("fffff", "createUserWithEmail:success");
//                                    FirebaseUser user = mAuth.getCurrentUser();
//                                    // updateUI(user);
//
//
//
//                                } else {
//                                    // If sign in fails, display a message to the user.
//                                    Log.w("ggggg", "createUserWithEmail:failure", task.getException());
//                                    Toast.makeText(Login.this, "Authentication failed.",
//                                            Toast.LENGTH_SHORT).show();
//                                    // updateUI(null);
//                                }
//                            }
//                        });
            }

        });

        createacc.setOnClickListener(v -> {
            Intent intent=new Intent(this,Registration.class);
            startActivity(intent);
        });

    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            //reload();
        }
    }
}