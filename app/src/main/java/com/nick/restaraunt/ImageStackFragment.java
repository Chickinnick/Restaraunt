package com.nick.restaraunt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.StackView;

import java.util.ArrayList;

/**
 * Created by Nick on 22.03.2015.
 */
public class ImageStackFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View viewHierarchy = inflater.inflate(R.layout.fragment_stack_view, container, false);
        StackView stk = (StackView) viewHierarchy.findViewById(R.id.stackView1);

        ArrayList<FotoStackItem> items = new ArrayList<FotoStackItem>();

        items.add(new FotoStackItem("text1", this.getResources().getDrawable(R.drawable.ic_launcher)));
        items.add(new FotoStackItem("text2", this.getResources().getDrawable(R.drawable.ic_launcher)));
        items.add(new FotoStackItem("text3", this.getResources().getDrawable(R.drawable.ic_launcher)));
        items.add(new FotoStackItem("text4", this.getResources().getDrawable(R.drawable.ic_launcher)));
        items.add(new FotoStackItem("text5", this.getResources().getDrawable(R.drawable.ic_launcher)));

        StackFotoAdapter adapt = new StackFotoAdapter(getActivity(), R.layout.item_frag_stack, items);

        stk.setAdapter(adapt);
        return viewHierarchy;
    }

}


