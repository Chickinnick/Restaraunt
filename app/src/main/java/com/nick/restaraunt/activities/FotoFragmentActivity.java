package com.nick.restaraunt.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.nick.restaraunt.R;


public class FotoFragmentActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_fragment);
        /*if (savedInstanceState == null) {
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
*/

    }
}


