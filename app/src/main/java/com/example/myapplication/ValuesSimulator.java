package com.example.myapplication;

import java.util.Random;

public class ValuesSimulator {
    private int Row;
    private double Temperature;
    private int Humidity;

    public ValuesSimulator() {
        Row = 1 + (int)(Math.random() * 3);
        double random = new Random().nextDouble();
        Temperature = -20 + (random * (50 - (-20)));
        Temperature = Double.parseDouble(String.format("%.1f", Temperature));
        Humidity = 0 + (int)(Math.random() * 100);

    }

    public int getRow() {
        return Row;
    }

    public void setRow(int row) {
        this.Row = row;
    }

    public double getTemperature() {
        return Temperature;
    }

    public void setTemperature(double temperature) {
        this.Temperature = temperature;
    }

    public int getHumidity() {
        return Humidity;
    }

    public void setHumidity(int humidity) {
        this.Humidity = humidity;
    }



}
