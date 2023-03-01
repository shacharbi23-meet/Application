package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView top_text;
    private EditText email;
    private Button SignUp;
    private Button SignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        top_text = findViewById(R.id.top_text);
        email = findViewById(R.id.email);
        SignUp = findViewById(R.id.SignUp);
        SignIn = findViewById(R.id.SignIn);
        SignIn.setOnClickListener(this);
        SignUp.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v == SignIn){
            Toast.makeText(this, "Sign up is under construction, please come back later!", Toast.LENGTH_LONG).show();
        }
        else if (v == SignUp){
            SignIn.setText(SignIn.getText().toString());
        }
    }
}