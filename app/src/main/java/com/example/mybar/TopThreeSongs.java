package com.example.mybar;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class TopThreeSongs extends AppCompatActivity implements SensorEventListener {

    private SensorManager mSensorManager;
    private Sensor mAccelSensor;
    private float mAccel;
    private float mAccelCurrent;
    private float mAccelLast;
    private float mLastX = 0;
    private float mLastY = 0;
    private float mLastZ = 0;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_three_songs);

        this.mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        this.mAccelSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        mAccel = 0.00f;
        mAccelCurrent = SensorManager.GRAVITY_EARTH;
        mAccelLast = SensorManager.GRAVITY_EARTH;

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        mLastX = event.values[0];
        mLastY = event.values[1];
        mLastZ = event.values[2];


        float SHAKE_THRESHOLD = (float) 4.0;
        mAccelLast = mAccelCurrent;
        mAccelCurrent = (float) Math.sqrt(mLastX * mLastX + mLastY * mLastY + mLastZ * mLastZ);
        float delta = mAccelCurrent - mAccelLast;
        mAccel = mAccel * 0.9f + delta;

        if (mAccel > SHAKE_THRESHOLD) {
            Toast.makeText(this, "A Shake!!!!!", Toast.LENGTH_LONG).show();
            mp.setDataSource(getApplicationContext(), audioUri);
            mp = MediaPlayer.create(context. R.raw.everyday);
            mp.start();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    protected void onResume() {
        super.onResume();
        this.mSensorManager.registerListener(this, mAccelSensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.mSensorManager.unregisterListener(this);
    }
}
