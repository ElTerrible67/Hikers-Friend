package com.example.ciara.hikersfriend;

import android.os.AsyncTask;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WeatherActivity extends AppCompatActivity {
String StringUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

      //  StringUrl = "http://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=090ee1e0f1f1d48749954ecce4984204";


    }

    public class DownnloadTask extends AsyncTask<>
}
