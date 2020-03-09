package com.zain.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView Cycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "ON onCreate() Called", Toast.LENGTH_SHORT).show();
        Log.d("Cycle", "onCreate:");
        Cycle = findViewById(R.id.cycle);
        Cycle.setText("onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "ON Start() Called", Toast.LENGTH_SHORT).show();
        Log.d("Cycle", "onStart: ");
        Cycle.setText("onStart");
    }
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(MainActivity.this, "ON Post Resume() Called", Toast.LENGTH_SHORT).show();
        Log.d("Cycle", "onPostResume: ");
        Cycle.setText("onPostResume");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "ON Resume() Called", Toast.LENGTH_SHORT).show();
        Log.d("Cycle", "onResume: ");
        Cycle.setText("onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "ON Pause() Called", Toast.LENGTH_SHORT).show();
        Log.d("Cycle", "onPause: ");
        Cycle.setText("onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "ON Stop() Called", Toast.LENGTH_SHORT).show();
        Log.d("Cycle", "onStop: ");
        Cycle.setText("onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "ON Destroy() Called", Toast.LENGTH_SHORT).show();
        Log.d("Cycle", "onDestroy: ");
        Cycle.setText("onDestroy");
    }
}
