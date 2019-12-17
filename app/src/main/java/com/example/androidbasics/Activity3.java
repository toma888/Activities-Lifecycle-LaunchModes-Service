package com.example.androidbasics;

public class Activity3 extends BasicActivity {

    @Override
    protected void performForwardTap() {
        startActivity(Activity4.class);
    }
}
