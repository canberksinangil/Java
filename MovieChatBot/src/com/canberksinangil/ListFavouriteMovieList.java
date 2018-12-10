package com.canberksinangil;

public class ListFavouriteMovieList extends CommandBase implements Command {

    public ListFavouriteMovieList(String commandKeyword) {
        super(commandKeyword);
    }

    @Override
    public void execute(String commandArgument) {
        int counter = 1;
        for (String movieName : favouriteMovie) {
            System.out.println(counter + ". " + movieName);
            counter++;
        }
    }

    @Override
    public String commandDescription() {
        return "Type 'showfav' to list favourite movies.";
    }
}

