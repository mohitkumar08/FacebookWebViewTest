package com.bit.facebookwebviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.thefinestartist.finestwebview.FinestWebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openFacebook(View view) {
        new FinestWebView.Builder(this).show("https://www.facebook.com/");

    }
}
