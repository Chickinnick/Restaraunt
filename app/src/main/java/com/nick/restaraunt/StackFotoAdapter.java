package com.nick.restaraunt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nick on 22.03.2015.
 */
public class StackFotoAdapter extends ArrayAdapter<FotoStackItem> {

    private ArrayList<FotoStackItem> items;
    private Context ctx;

    public StackFotoAdapter(Context context, int resource, ArrayList<FotoStackItem> objects) {
        super(context, resource, objects);
        this.items = objects;
        this.ctx = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater)
                    ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.item_frag_stack, null);
        }

        FotoStackItem m = items.get(position);

        if (m != null) {
            TextView text = (TextView) v.findViewById(R.id.textViewStack);
            ImageView img = (ImageView) v.findViewById(R.id.imageViewStack);

            if (text != null) {
                text.setText(m.text);
                img.setImageDrawable(m.img);
            }
        }
        return v;
    }
}
