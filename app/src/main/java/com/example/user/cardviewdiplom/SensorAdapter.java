package com.example.user.cardviewdiplom;

import android.hardware.Sensor;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class SensorAdapter extends RecyclerView.Adapter {
    public SensorAdapter(List<Sensor> sensors) {
    }

    public SensorAdapter(MainActivity mainActivity, List<SensorDescription> sensorDescriptions) {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
