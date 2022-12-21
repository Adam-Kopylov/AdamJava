package com.example.javaoop;

import android.util.Log;

public class Cat {
    int age;
    String name;
    String breed;
    String color;

    public void talk() {
        Log.i("talk()", "Meow! My name is " + name + ", and I'm " + age +" years old. My breed is " + breed + ".I have "+ color + " hair." );
    }

}
