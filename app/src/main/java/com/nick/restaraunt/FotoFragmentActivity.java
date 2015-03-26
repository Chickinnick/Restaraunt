package com.nick.restaraunt;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class FotoFragmentActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_fragment);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ImageStackFragment())
                    .commit();
        }
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOne();
            }
        });
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTwo();
            }
        });
    }


    private void showOne() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ImageStackFragment())
                .commit();
    }

    private void showTwo() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ImageStackFragment1())
                .commit();
    }


}


