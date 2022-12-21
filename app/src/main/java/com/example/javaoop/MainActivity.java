package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
        Cat MyCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyCat = new Cat();
        MyCat.name = "Pups";
        MyCat.age = 2;
        MyCat.breed = "Main coon";
        MyCat.color = "black";
        MyCat.talk();
    }
}