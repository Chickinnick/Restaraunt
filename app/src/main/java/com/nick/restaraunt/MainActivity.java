package com.nick.restaraunt;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    public ActionBar getActionBar() {
        return super.getActionBar();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActionBar().hide();

        int secondsDelayed = 3;

        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(MainActivity.this, ListOfCategoriesActivity.class));
                finish();
            }
        }, secondsDelayed * 1000);

        Button btn = (Button) findViewById(R.id.splashButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переходим с первой на вторую активность
                Intent intent = new Intent(MainActivity.this, ListOfCategoriesActivity.class);
                startActivity(intent);

            }
        });

    }
}
