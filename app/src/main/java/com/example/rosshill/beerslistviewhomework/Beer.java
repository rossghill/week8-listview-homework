package com.example.rosshill.beerslistviewhomework;

/**
 * Created by rosshill on 23/01/2018.
 */

public class Beer {

    private Integer ranking;
    private String name;

    public Beer(Integer ranking, String name) {
        this.ranking = ranking;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getRanking() {
        return ranking;
    }
}
