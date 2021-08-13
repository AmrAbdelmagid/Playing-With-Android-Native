package com.example.mytestapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    private static final String TAG = "LIFECYCLE";

    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Next", Toast.LENGTH_SHORT).show());
    }

    public void closeMethod(View view) {
        finish();
    }
}

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.i(TAG, "onStart");
//        System.out.println("onStart");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.i(TAG, "onResume");
//        System.out.println("onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.i(TAG, "onPause");
//        System.out.println("onPause");
//    }
//
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.i(TAG, "onStop");
//        System.out.println("onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.i(TAG, "onDestroy");
//        System.out.println("onDestroy");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.i(TAG, "onRestart");
//        System.out.println("onRestart");
//    }
