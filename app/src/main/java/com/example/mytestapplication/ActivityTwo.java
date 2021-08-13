package com.example.mytestapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    TextView message;
    TextView phone;
    Intent incomingIntent;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        incomingIntent = getIntent();
        message = (TextView) findViewById(R.id.txtMessage);
        phone = (TextView) findViewById(R.id.txtPhone);
        btnBack = (Button) findViewById(R.id.btnClose);
        message.setText(incomingIntent.getStringExtra(MainActivity.MESSAGE));
        phone.setText(incomingIntent.getStringExtra(MainActivity.PHONE));
        btnBack.setOnClickListener(v -> {
            finish();
        });
    }

}