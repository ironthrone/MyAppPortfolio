package com.example.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.spotify).setOnClickListener(this);
        findViewById(R.id.scores).setOnClickListener(this);
        findViewById(R.id.library).setOnClickListener(this);
        findViewById(R.id.bigger).setOnClickListener(this);
        findViewById(R.id.reader).setOnClickListener(this);
        findViewById(R.id.capstone).setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.spotify:
                Toast.makeText(MainActivity.this, "This button will launch spotify streamer!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores:
                Toast.makeText(MainActivity.this, "This button will launch scores app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.library:
                Toast.makeText(MainActivity.this, "This button will launch library app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bigger:
                Toast.makeText(MainActivity.this, "This button will launch build it bigger!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.reader:
                Toast.makeText(MainActivity.this, "This button will launch xyz reader!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(MainActivity.this, "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
                break;
            
            
        }
    }
}
