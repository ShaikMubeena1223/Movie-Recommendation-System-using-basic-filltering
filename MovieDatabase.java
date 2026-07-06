package database;

import java.util.ArrayList;

import movie.Movie;
import utility.CSVReader;

public class MovieDatabase {

    private ArrayList<Movie> movieList;

    public MovieDatabase() {

        movieList = new ArrayList<>();

        ArrayList<String[]> data = CSVReader.readCSV("data/movies.csv");

        for (String[] row : data) {

            int id = Integer.parseInt(row[0]);
            String movieName = row[1];
            String cast = row[2];
            String review = row[3];
            String status = row[4];
            String releaseDate = row[5];

            Movie movie = new Movie(id, movieName, cast, review, status, releaseDate);

            movieList.add(movie);
        }
    }

    public ArrayList<Movie> getAllMovies() {
        return movieList;
    }

}