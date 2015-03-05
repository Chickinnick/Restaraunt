package com.nick.restaraunt;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CategoryAdapter extends ArrayAdapter<CategoryOfDish> {

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