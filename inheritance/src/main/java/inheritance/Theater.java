package inheritance;

import java.util.ArrayList;

public class Theater {
    String name;
    ArrayList<String> allMovies = new ArrayList<>();
    ArrayList<Review> allReviews = new ArrayList<>();

    public Theater(String name) {
        this.name = name;
    }

    public void addMovie(String movie) {
        if (!allMovies.contains(movie)) {
            allMovies.add(movie);
        }
    }

    public void removeMovie (String movie) {
        if (allMovies.contains(movie)) {
            allMovies.remove(movie);
        }
    }

    public void addReview(Review review) {
        if(!allReviews.contains(review)) {
            allReviews.add(review);
        }
    }

    public ArrayList<String> getMovies() {
        return allMovies;
    }

    public ArrayList<Review> getReviews() {
        return allReviews;
    }


    //Need to write how I want movies to be displayed
    public String toString() {
        String moviesList = "[ ";
        for(String movie: allMovies) {
            moviesList += movie + " ";
        }

        return "Theater{" +
                "name='" + name + '\'' +
                ", allMovies=" + moviesList + "]" +
                '}';
    }


}
