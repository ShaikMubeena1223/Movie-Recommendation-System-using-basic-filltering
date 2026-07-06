package algorithm;

import java.util.ArrayList;

import movie.Movie;

public class RecommendationEngine {

    // Display all movies
    public void displayAllMovies(ArrayList<Movie> movies) {

        for (Movie movie : movies) {
            System.out.println("------------------------------");
            System.out.println(movie);
        }
    }

    // Search movie by name
    public void searchMovie(ArrayList<Movie> movies, String movieName) {

        boolean found = false;

        for (Movie movie : movies) {

            if (movie.getMovieName().equalsIgnoreCase(movieName)) {

                System.out.println(movie);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Movie Not Found.");
        }
    }

    // Search movies by cast
    public void searchByCast(ArrayList<Movie> movies, String castName) {

        boolean found = false;

        for (Movie movie : movies) {

            if (movie.getCast().toLowerCase().contains(castName.toLowerCase())) {

                System.out.println("------------------------------");
                System.out.println(movie);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Movies Found.");
        }
    }

    // Display Hit and Blockbuster movies
    public void displayHitMovies(ArrayList<Movie> movies) {

        for (Movie movie : movies) {

            if (movie.getStatus().equalsIgnoreCase("Hit")
                    || movie.getStatus().equalsIgnoreCase("Blockbuster")) {

                System.out.println("------------------------------");
                System.out.println(movie);
            }
        }
    }

    // Display Flop movies
    public void displayFlopMovies(ArrayList<Movie> movies) {

        for (Movie movie : movies) {

            if (movie.getStatus().equalsIgnoreCase("Flop")) {

                System.out.println("------------------------------");
                System.out.println(movie);
            }
        }
    }

    // Search by release year
    public void searchByYear(ArrayList<Movie> movies, String year) {

        boolean found = false;

        for (Movie movie : movies) {

            if (movie.getReleaseDate().contains(year)) {

                System.out.println("------------------------------");
                System.out.println(movie);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Movies Found.");
        }
    }
}