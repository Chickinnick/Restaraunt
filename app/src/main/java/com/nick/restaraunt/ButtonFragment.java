package com.nick.restaraunt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nick on 22.03.2015.
 */
public class ButtonFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View viewHierarchy = inflater.inflate(R.layout.fragment_button, container, false);
        return viewHierarchy;
    }
}
