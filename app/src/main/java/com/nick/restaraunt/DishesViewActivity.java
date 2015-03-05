package com.nick.restaraunt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;


    public class DishesViewActivity extends Activity {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_dishes_view);

            Intent intent = getIntent();

            int nomber = intent.getIntExtra("nomberInList", 0);

            GridView gridview = (GridView) findViewById(R.id.gridview);
            gridview.setAdapter(new ImageTextAdapter(this, nomber));

            gridview.setOnItemClickListener(gridviewOnItemClickListener);

        }

        private GridView.OnItemClickListener gridviewOnItemClickListener = new GridView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);

                i.putExtra("nomberInList",position);
                startActivity(i);

            }

        };
    }

