package com.nick.restaraunt.activities;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.nick.restaraunt.R;

import java.util.ArrayList;
import java.util.List;


public class ListOfCategoriesActivity extends Activity {

    @Override
    public ActionBar getActionBar() {
        return super.getActionBar();
    }


    public class CategoryOfDish {

        private String name;

        public CategoryOfDish(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    class CategoryAdapter extends ArrayAdapter<CategoryOfDish> {

        public CategoryAdapter(Context context, List<CategoryOfDish> objects) {
            super(context, 0, objects);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            View view = View.inflate(getContext(), R.layout.caiegory_item, null);
            TextView name = (TextView) view.findViewById(R.id.nameOfCategory);

            CategoryOfDish cat = getItem(position);
            name.setText(cat.getName());
            return view;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_categories);
        ListView listView = (ListView) findViewById(R.id.listview);
        getActionBar().hide();

        final List<CategoryOfDish> categ = new ArrayList<>();

        categ.add(new CategoryOfDish("Горячие Закуски"));
        categ.add(new CategoryOfDish("Салаты"));
        categ.add(new CategoryOfDish("Первые Блюда"));
        categ.add(new CategoryOfDish("Супы"));
        categ.add(new CategoryOfDish("Мясные Блюда"));
        categ.add(new CategoryOfDish("Бар"));


        final CategoryAdapter adapter = new CategoryAdapter(this, categ);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CategoryOfDish category = (CategoryOfDish) parent.getItemAtPosition(position);


                Intent i = new Intent(ListOfCategoriesActivity.this, DishesViewActivity.class);

                i.putExtra("nomberInList", position);

                startActivity(i);
            }
        });

    }


}
