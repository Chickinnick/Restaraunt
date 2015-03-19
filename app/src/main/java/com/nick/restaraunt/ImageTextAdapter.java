package com.nick.restaraunt;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nick on 16.03.2015.
 */
public class ImageTextAdapter extends BaseAdapter {
    private Context mContext;
    private int nomberInListOfCategories;
    public ImageTextAdapter(Context c, int nomberInListOfCategories) {
        mContext = c;
        this.nomberInListOfCategories = nomberInListOfCategories;
    }

    public int getCount() {
        return Dish.hotStrIds.length;
    }

    public Object getItem(int position) {
        switch (position){

            case 0:
                return Dish.hotPicIds[position];

            case 1:
                return Dish.saladPicIds[position];

            default:
                return 0;}
    }

    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View grid;

        if (convertView == null) {
            grid = new View(mContext);
            //LayoutInflater inflater = getLayoutInflater();
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            grid = inflater.inflate(R.layout.dish_item, parent, false);
        } else {
            grid = (View) convertView;
        }

        ImageView imageView = (ImageView) grid.findViewById(R.id.Gridimageview);
        TextView textView = (TextView) grid.findViewById(R.id.Gridtextview);

        switch (nomberInListOfCategories) {

            case 0:
                imageView.setImageResource(Dish.hotPicIds[position]);
                textView.setText(Dish.hotStrIds[position]);
                break;
            case 1:
                imageView.setImageResource(Dish.saladPicIds[position]);
                textView.setText(Dish.saladStrIds[position]);
                break;
           /* case 2:
                imageView.setImageResource(Dish.hotPicIds[position]);
                textView.setText(Dish.hotStrIds[position]);
                break;
            case 3:
                imageView.setImageResource(Dish.hotPicIds[position]);
                textView.setText(Dish.hotStrIds[position]);
                break;
            case 4:
                imageView.setImageResource(Dish.hotPicIds[position]);
                textView.setText(Dish.hotStrIds[position]);
                break;
            case 5:
                imageView.setImageResource(Dish.hotPicIds[position]);
                textView.setText(Dish.hotStrIds[position]);
                break;*/
            case 6:
                Intent Bar = new Intent();
        }

        return grid;
    }
}
