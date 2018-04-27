package com.example.android.models;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class DataModel extends ViewModel {
    private MutableLiveData<Data_PM> measurementLive;

    public MutableLiveData<Data_PM> getmeasurementLive() {
        if (measurementLive == null) {
            measurementLive = new MutableLiveData<Data_PM>();
        }
        return measurementLive;
    }
}
