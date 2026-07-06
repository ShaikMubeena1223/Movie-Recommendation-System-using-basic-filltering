import java.util.ArrayList;
import java.util.Scanner;

import algorithm.RecommendationEngine;
import database.MovieDatabase;
import movie.Movie;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MovieDatabase database = new MovieDatabase();

        ArrayList<Movie> movies = database.getAllMovies();

        RecommendationEngine engine = new RecommendationEngine();

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println(" TELUGU MOVIE RECOMMENDATION SYSTEM");
            System.out.println("======================================");
            System.out.println("1. View All Movies");
            System.out.println("2. Search Movie");
            System.out.println("3. Search By Cast");
            System.out.println("4. View Hit Movies");
            System.out.println("5. View Flop Movies");
            System.out.println("6. Search By Release Year");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    engine.displayAllMovies(movies);
                    break;

                case 2:
                    System.out.print("Enter Movie Name: ");
                    String movieName = sc.nextLine();
                    engine.searchMovie(movies, movieName);
                    break;

                case 3:
                    System.out.print("Enter Cast Name: ");
                    String cast = sc.nextLine();
                    engine.searchByCast(movies, cast);
                    break;

                case 4:
                    engine.displayHitMovies(movies);
                    break;

                case 5:
                    engine.displayFlopMovies(movies);
                    break;

                case 6:
                    System.out.print("Enter Release Year: ");
                    String year = sc.nextLine();
                    engine.searchByYear(movies, year);
                    break;

                case 7:
                    System.out.println("Thank You for Using Movie Recommendation System.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}