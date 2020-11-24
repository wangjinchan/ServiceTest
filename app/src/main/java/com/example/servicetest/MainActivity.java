package com.example.servicetest;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start=findViewById(R.id.start_service);
        Button stop=findViewById(R.id.stop_service);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.start_service:
                Intent startIntent=new Intent(MainActivity.this,MyService.class);
                startService(startIntent);
                break;
            case R.id.stop_service:
                Intent stopIntent =new Intent(MainActivity.this,MyService.class);
                stopService(stopIntent);
                break;
        }
    }
}
