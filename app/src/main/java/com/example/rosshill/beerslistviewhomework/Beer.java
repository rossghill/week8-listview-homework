package com.example.rosshill.beerslistviewhomework;

import android.graphics.drawable.Icon;

/**
 * Created by rosshill on 23/01/2018.
 */

public class Beer {

    private Integer ranking;
    private String name;
//    private Icon icon;



    public Beer(Integer ranking, String name) {
        this.ranking = ranking;
        this.name = name;
//        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public Integer getRanking() {
        return ranking;
    }

//    public Icon getIcon() {
//        return icon;
//    }

    @Override
    public String toString() {
        return this.getName();
    }
}
