package com.hmdb.hmdb;

import java.util.ArrayList;

public class Actor {
    public static ArrayList<Actor> actors = new ArrayList<>();

    public Integer id;
    public String firstName;
    public String lastName;
    public Integer birthYear;
    public Integer movieId;

    static {
        new Actor(1, "Steven", "Yeun", 1982, 1);
        new Actor(2, "Tom", "Hanks", 1956, 2);
        new Actor(3, "Viola", "Davis", 1965, 3);
    }

    public Actor(Integer id, String firstName, String lastName, Integer birthYear, Integer movieId) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.movieId= movieId;
        Actor.actors.add(this);
    }

}
