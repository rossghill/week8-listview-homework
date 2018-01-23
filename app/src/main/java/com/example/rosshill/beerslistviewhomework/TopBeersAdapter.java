package com.example.rosshill.beerslistviewhomework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rosshill on 23/01/2018.
 */

public class TopBeersAdapter extends ArrayAdapter<Beer> {

//    String img;

    public TopBeersAdapter(Context context, ArrayList<Beer> beers) {
        super(context, 0, beers);
    }

    @Override
    public View getView (int position, View listItemView, ViewGroup parent) {
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.beer_item, parent, false);
        }
        Beer currentBeer = getItem(position);

//        ImageView image = listItemView.findViewById(R.id.beer_img);
//        image.setImageIcon(currentBeer.getIcon());

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentBeer.getRanking().toString());

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentBeer.getName());

        return listItemView;
    }
}
