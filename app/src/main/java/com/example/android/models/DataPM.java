package com.example.android.models;


public class DataPM extends Data{
    Double pm2_5;
    Double pm10;

    public DataPM(int id, String date_mesure, Double pm2_5, Double pm10) {
        super(id, date_mesure);
        this.pm2_5 = pm2_5;
        this.pm10 = pm10;
    }

    @Override
    public String toString() {
        return getDate() + " : "  +  pm2_5 + " : " + pm10;
    }

}