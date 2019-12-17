package com.example.androidbasics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        findViewById(R.id.button_back).setOnClickListener(v -> performBackTap());
        findViewById(R.id.button_forward).setOnClickListener(v -> performForwardTap());
    }

    protected void performBackTap() {
        onBackPressed();
    }

    protected abstract void performForwardTap();

    protected void startActivity(Class<? extends AppCompatActivity> activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }
}
