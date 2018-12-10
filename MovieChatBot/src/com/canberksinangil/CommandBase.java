package com.canberksinangil;

import java.util.ArrayList;
import java.util.List;

public abstract class CommandBase {

    private String commandKeyword;
    static List<String> favouriteMovie = new ArrayList<>();
    static List<String> movie = new ArrayList<>();

    public CommandBase(String commandKeyword) {
        this.commandKeyword = commandKeyword;
    }

    public boolean movieBoundChecker(int givenIndex) {
        System.out.println();

        if (movie.size() >= givenIndex && givenIndex >= 1) {
            return true;
        } else {
            System.out.println("Please enter a correct number!");
            return false;
        }

    }

    public boolean movieBoundChecker(String givenIndex) {
        return movieBoundChecker(intParser(givenIndex));
    }


    public boolean favouriteMovieBoundChecker(int givenIndex) {

        if (favouriteMovie.size() >= givenIndex && givenIndex >= 1) {
            return true;
        } else {
            System.out.println("Please enter a correct number!");
            return false;
        }

    }

    public boolean favouriteMovieBoundChecker(String givenIndex) {
        return favouriteMovieBoundChecker(intParser(givenIndex));
    }

    public int intParser(String commandArgument) {
        return Integer.parseInt(commandArgument);
    }

    public boolean isThisMovieExist(String movieName) {
        if (movie.contains(movieName)) {
            System.out.println("This movie already in the list!");
            return true;
        } else {
            return false;
        }
    }

    public boolean isThisFavouriteMovieExist(String movieName) {
        if (favouriteMovie.contains(movieName)) {
            System.out.println("This movie already in the list!");
            return true;
        } else {
            return false;
        }
    }

}
