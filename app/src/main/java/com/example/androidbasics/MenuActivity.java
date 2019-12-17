package com.example.androidbasics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        findViewById(R.id.buttonFirst).setOnClickListener(v -> performFirstTap());
        findViewById(R.id.buttonSecond).setOnClickListener(v -> performSecondTap());
    }

    private void performFirstTap() {
        startActivity(new Intent(this, Activity1.class));
    }

    private void performSecondTap() {
        startActivity(new Intent(this, ServiceActivity.class));
    }
}


