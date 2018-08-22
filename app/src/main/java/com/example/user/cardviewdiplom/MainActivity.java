package com.example.user.cardviewdiplom;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SensorManager sensorManager;
    private List<Sensor> sensors;
    List<SensorDescription> sensorDescriptions=new ArrayList<>();
    SensorAdapter sensorAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.news_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        sensors = (List<Sensor>) findViewById(R.id.sensors);

        LinearLayoutManager llm = new LinearLayoutManager(this);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensors = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);
        sensors = sensorManager.getSensorList(Sensor.TYPE_GYROSCOPE);
        sensors=sensorManager.getSensorList(Sensor.TYPE_MAGNETIC_FIELD);
        for (Sensor sensor : sensors) {
            sensorDescriptions.add(new SensorDescription(sensor.getName(),String.valueOf(sensor.getType()),sensor.getVendor(), String.valueOf(sensor.getVersion()), String.valueOf(sensor.getMaximumRange()),String.valueOf(sensor.getResolution())));

        }
        sensorAdapter=  new SensorAdapter(this,sensorDescriptions);
        recyclerView.setAdapter(sensorAdapter);
        sensorAdapter.notifyDataSetChanged();

    }
    }





