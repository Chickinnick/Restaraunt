package com.nick.restaraunt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.StackView;

import java.util.ArrayList;


public class ImageStackFragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View viewHierarchy = inflater.inflate(R.layout.fragment_stack_view, container, false);
        StackView stk = (StackView) viewHierarchy.findViewById(R.id.stackView1);

        ArrayList<FotoStackItem> items = new ArrayList<>();

        items.add(new FotoStackItem("OTHER FRAGMENT", this.getResources().getDrawable(R.drawable.foto_stack1)));
        items.add(new FotoStackItem("text2", this.getResources().getDrawable(R.drawable.foto_stack2)));
        items.add(new FotoStackItem("text3", this.getResources().getDrawable(R.drawable.foto_stack3)));
        items.add(new FotoStackItem("text4", this.getResources().getDrawable(R.drawable.foto_stack4)));

        items.add(new FotoStackItem("text6", this.getResources().getDrawable(R.drawable.foto_stack6)));
        items.add(new FotoStackItem("text7", this.getResources().getDrawable(R.drawable.foto_stack7)));
        items.add(new FotoStackItem("text8", this.getResources().getDrawable(R.drawable.foto_stack8)));
        items.add(new FotoStackItem("text9", this.getResources().getDrawable(R.drawable.foto_stack9)));

        StackFotoAdapter adapt = new StackFotoAdapter(getActivity(), R.layout.item_frag_stack, items);

        stk.setAdapter(adapt);
        return viewHierarchy;
    }

}


