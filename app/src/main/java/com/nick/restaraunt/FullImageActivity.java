package com.nick.restaraunt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;


public class FullImageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        // get intent data
        Intent i = getIntent();


        int nomber = i.getIntExtra("nomberInList", 0);

        ImageTextAdapter imageAdapter = new ImageTextAdapter(this,nomber);

        ImageView imageView = (ImageView) findViewById(R.id.fullScreenDish);
        imageView.setImageResource((Integer) imageAdapter.getItem(nomber));

    }
}



