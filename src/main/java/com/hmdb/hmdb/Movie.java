package com.hmdb.hmdb;

import java.util.ArrayList;

public class Movie {
    public static ArrayList<Movie> movies = new ArrayList<>();

    public Integer id;
    public String title;
    public String description;
    public Integer year;

    static {
        new Movie(
                1,
                "Minari",
                "Minari offers an intimate and heart-wrenching portrait of family and assimilation in 1980s Americ",
                2021);

        new Movie(
                2,
                "Catch Me If You Can",
                "Barely 21 yet, Frank is a skilled forger who has passed as a doctor, lawyer and pilot. FBI agent Carl becomes obsessed with tracking down the con man, who only revels in the pursuit.",
                2002);

        new Movie(
                3,
                "Ma Rainey's Black Bottom",
                "Tensions and temperatures rise at a Chicago music studio in 1927 when fiery, fearless blues singer Ma Rainey joins her band for a recording session.",
                2020);
    }

    public Movie(Integer id, String title, String description, Integer year) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.year = year;

        Movie.movies.add(this);
    }
}
