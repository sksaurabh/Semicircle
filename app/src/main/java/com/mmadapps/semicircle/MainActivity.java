package com.mmadapps.semicircle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CentralCircleView centralCircleView = (CentralCircleView) findViewById(R.id.centralCircleView);
        centralCircleView.setTranslationX(200f);
        centralCircleView.setTranslationY(200f);
        centralCircleView.invalidate();
    }
}
