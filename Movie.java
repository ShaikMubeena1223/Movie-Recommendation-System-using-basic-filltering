package movie;

public class Movie {

    private int id;
    private String movieName;
    private String cast;
    private String review;
    private String status;
    private String releaseDate;

    public Movie(int id, String movieName, String cast,
                 String review, String status, String releaseDate) {

        this.id = id;
        this.movieName = movieName;
        this.cast = cast;
        this.review = review;
        this.status = status;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getCast() {
        return cast;
    }

    public String getReview() {
        return review;
    }

    public String getStatus() {
        return status;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Movie Name : " + movieName +
               "\nCast       : " + cast +
               "\nReview     : " + review +
               "\nStatus     : " + status +
               "\nRelease    : " + releaseDate;
    }
}