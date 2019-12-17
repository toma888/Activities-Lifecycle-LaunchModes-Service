package com.example.androidbasics;

public class Activity1 extends BasicActivity {

    @Override
    protected void performForwardTap() {
        startActivity(Activity2.class);
    }
}
