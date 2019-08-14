package inheritance;

public class MovieReview extends Review {
    String movie;

    public MovieReview(String body, String author, double rating, String movie) {
        super(body, author, rating);
        this.movie = movie;
    }

    public String toString() {
        return "MovieReview{" +
                "movie='" + movie + '\'' +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", rating=" + rating +
                '}';
    }
}
