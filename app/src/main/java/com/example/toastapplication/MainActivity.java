package com.example.toastapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toaster.Toasterapp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toasterapp.SimpleToast(this,"Heloo World");
    }
}