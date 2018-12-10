package com.canberksinangil;

public class AddToFavouriteCommand extends CommandBase implements Command {

    public AddToFavouriteCommand(String commandKeyword) {
        super(commandKeyword);
    }

    @Override
    public void execute(String commandArgument) {
        if (movieBoundChecker(commandArgument)) {
            if (!isThisFavouriteMovieExist(commandArgument)) {
                favouriteMovie.add(movie.get(intParser(commandArgument) - 1));
                System.out.println("Movie = " + movie.get(intParser(commandArgument) - 1) + " added to favourite list.");
            } else {
                System.out.println("Movie is already in the list!");
            }
        }
    }

    @Override
    public String commandDescription() {
        return "Type 'addfav <movie number>' to add the favourite. (Please type 'show' to see movie numbers.)";
    }
}
