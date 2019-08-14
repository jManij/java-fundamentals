package inheritance;

import java.util.ArrayList;

public class Restaurant {
    String name;
    double rating;
    String price_category;

    ArrayList <Review> allReviews = new ArrayList<>();

    //Constructor
    public Restaurant(String name, double rating, String price_category) {
        this.name = name;
        this.rating = rating;
        this.price_category = price_category;
    }

    // String representation of the Restaurant
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", price_category='" + price_category + '\'' +
                '}';
    }

    // Adds new review
    public void addReview (Review review) {
        if(!allReviews.contains(review)) {
            allReviews.add(review);
            updateReview();
        }
    }

    // Update existing review
    private void updateReview() {
        double sum = 0.0;
        for (Review review : allReviews) {
            sum += review.rating;
        }
        this.rating = Math.round((sum / allReviews.size() * 100.0) / 100.0);
    }
}
