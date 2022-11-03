package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class LandingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        AppCompatButton btnRegister = findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(v -> {

            startActivity(new Intent(LandingActivity.this, RegisterActivity.class));
            finish();

        });

        TextView txtLogin = findViewById(R.id.txt_login);
        txtLogin.setOnClickListener(v -> {
            startActivity(new Intent(LandingActivity.this, LoginActivity.class));
            finish();

        });




    }
}