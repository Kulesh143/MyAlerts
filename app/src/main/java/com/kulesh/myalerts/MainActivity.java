package com.kulesh.myalerts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showalert(View view) {
        AlertOne a=new AlertOne();
        a.show(getSupportFragmentManager(),"Alert 1");
    }

    public void showcustomalert(View view) {
        CustomAlertOne customAlertOne=new CustomAlertOne();
        customAlertOne.show(getSupportFragmentManager(),"Custom 1");
    }
}