package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");


    }

    public void LaunchValvesPage(View view){                                               //This method opens the main valve page
        Intent i = new Intent(this, Valves.class);
        startActivity(i);


    }
    public void LaunchAutomationPage(View view){                                               //This method opens the main valve page
        Intent i  = new Intent(this, Automation.class);
        startActivity(i);


    }
}