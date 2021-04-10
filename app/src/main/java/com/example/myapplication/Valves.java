package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Valves extends AppCompatActivity {
    Button getPlantStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valves);
        setTitle("Valves");

        ValuesSimulator newValue = new ValuesSimulator();

        getPlantStatus = (Button)findViewById(R.id.StatusButton);
        getPlantStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ROW: " + newValue.getRow() + "\n"+"Humidity: " + newValue.getHumidity() +"%"+ "\n"+ "Temperature: " + newValue.getTemperature() + "C", Toast.LENGTH_LONG).show();
            }
        });
        }
}