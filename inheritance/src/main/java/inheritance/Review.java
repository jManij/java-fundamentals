package inheritance;

public class Review {
    String body;
    String author;
    double rating;

    public Review(String body, String author, double rating) {
        this.body = body;
        this.author = author;
        this.rating = rating;
    }


    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }


}
