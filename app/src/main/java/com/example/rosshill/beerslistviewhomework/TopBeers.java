package com.example.rosshill.beerslistviewhomework;

import java.util.ArrayList;

/**
 * Created by rosshill on 23/01/2018.
 */

public class TopBeers {

    private ArrayList<Beer> beerlist;

    public TopBeers() {
        beerlist = new ArrayList<Beer>();
        beerlist.add(new Beer(1, "Belhaven Best"));
        beerlist.add(new Beer(2, "Hop House 13"));
        beerlist.add(new Beer(3, "McEwans 80-"));
        beerlist.add(new Beer(4, "Coors Light"));
        beerlist.add(new Beer(5, "Punk IPA"));
        beerlist.add(new Beer(6, "Tennents Lager"));
        beerlist.add(new Beer(7, "Guinness Original"));
        beerlist.add(new Beer(8, "Drygate Apple Ale"));
        beerlist.add(new Beer(9, "Hitachino Nest"));
        beerlist.add(new Beer(10, "Asahi"));
        beerlist.add(new Beer(11, "Pabst Blue Ribbon"));
        beerlist.add(new Beer(12, "Miller High Life"));
    }

    public ArrayList<Beer> getList() {
        return new ArrayList<Beer>(beerlist);
    }
}
