package hus.oop.lab8.Comparable;

import java.io.*;
import java.util.*;

class Movie implements Comparable<Movie>{
    List<Movie> movies;
    private String name;
    private double rating;
    private int year;

    public int compareTo(Movie movie) {
        return this.year - movie.year;
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public void sortMoviesManual() {
        for (int i = 0; i < movies.size() - 1; i++) {
            for (int j = i + 1; j < movies.size(); j++) {
                if(movies.get(i).compareTo(movies.get(j)) > 0) {
                    Movie temp = movies.get(i);
                    movies.set(i,movies.get(j));
                    movies.set(j,temp);

                }
            }
        }
    }

    public void sortMovies() {
        Collections.sort(movies);
    }
}
