package com.example.androidbasics;

public class Activity2 extends BasicActivity {

    @Override
    protected void performForwardTap() {
        startActivity(Activity3.class);
    }
}
