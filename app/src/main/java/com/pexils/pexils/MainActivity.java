package com.pexils.pexils;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pexils.pexils.Maps.MapsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSafeMaps = (Button)findViewById(R.id.btnSafeMaps);
        btnSafeMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMaps = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intentMaps);
            }
        });

    }
}
