package com.example.androidbasics;

public class Activity4 extends BasicActivity {

    @Override
    protected void performForwardTap() {
        startActivity(Activity1.class);
    }
}
