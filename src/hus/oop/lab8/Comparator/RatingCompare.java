package hus.oop.lab8.Comparator;

import java.util.Comparator;

class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        if (left.getRating() - right.getRating() > 0) {
            return 1;
        }
        if(left.getRating() - right.getRating() == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
