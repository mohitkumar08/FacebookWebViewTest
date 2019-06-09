package com.bit.facebookwebviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thefinestartist.finestwebview.FinestWebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new FinestWebView.Builder(this).show("https://www.facebook.com/");


    }
}
