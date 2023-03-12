package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private Button submitup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        submitup = findViewById(R.id.submitup);
        submitup.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v == submitup) {
            Intent inten = new Intent(this, HomeActivity.class);
            startActivity(inten);
        }
    }
}