package inheritance;

import java.util.ArrayList;

public class Shop {
    String name;
    String description;
    String dollarSigns;

    ArrayList<Review> allReviews = new ArrayList<>();

    public Shop(String name, String description, String dollarSigns) {
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;
    }

    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dollarSigns='" + dollarSigns + '\'' +
                '}';
    }

    public void addReview(Review review) {
        if(!allReviews.contains(review)) {
            allReviews.add(review);
        }
    }

    public ArrayList<Review> getReviews() {
        return allReviews;
    }

}
