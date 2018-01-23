package com.example.rosshill.beerslistviewhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    String img = "Beer";
//    int beer = R.drawable.beer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Beer> topBeers = new TopBeers().getList();

        TopBeersAdapter beersAdapter = new TopBeersAdapter(this, topBeers);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(beersAdapter);
    }
}
