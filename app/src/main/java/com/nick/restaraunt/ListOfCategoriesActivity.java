package com.nick.restaraunt;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ListOfCategoriesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_categories);
        ListView listView = (ListView) findViewById(R.id.listview);

        final List<CategoryOfDish> categ = new ArrayList<>();

        categ.add(new CategoryOfDish("Горячие Закуски"));
        categ.add(new CategoryOfDish("Салаты"));
        categ.add(new CategoryOfDish("Первые Блюда"));
        categ.add(new CategoryOfDish("Супы"));
        categ.add(new CategoryOfDish("Мясные Блюда"));
        categ.add(new CategoryOfDish("Бар"));




        final CategoryAdapter adapter = new CategoryAdapter(this,categ);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CategoryOfDish category = (CategoryOfDish) parent.getItemAtPosition(position);


                Intent i = new Intent(ListOfCategoriesActivity.this, DishesViewActivity.class);

                i.putExtra("nomberInList",position);

                startActivity(i);
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_list_of_categories, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       int id;

        id = item.getItemId();

        if(id == R.id.item1)
        {
            startActivity(new Intent(this, WebViewActivity.class));
            return true;
        }

        if(id == R.id.item2){
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://urartu.ua/ru/"));
            startActivity(browserIntent);
        }

        if(id == R.id.item3)
        {
            startActivity(new Intent(this, ServiceActivity.class));
            return true;
        }



        return super.onOptionsItemSelected(item);
    }


    
}
