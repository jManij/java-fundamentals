package inheritance;

public class Restaurant {
    String name;
    int rating;
    String price_category;

    //Constructor
    public Restaurant(String name, int rating, String price_category) {
        this.name = name;
        this.rating = rating;
        this.price_category = price_category;
    }

    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", price_category='" + price_category + '\'' +
                '}';
    }

    public void addReview (Review review) {
        this.rating = review.rating;
    }
}
