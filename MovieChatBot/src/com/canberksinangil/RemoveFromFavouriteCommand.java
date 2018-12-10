package com.canberksinangil;

public class RemoveFromFavouriteCommand extends CommandBase implements Command {

    public RemoveFromFavouriteCommand(String commandKeyword) {
        super(commandKeyword);
    }

    @Override
    public void execute(String commandArgument) {

        if (favouriteMovieBoundChecker(commandArgument)) {
            System.out.println("Movie removed from your favourite movie list. Please type 'showfav' to see your new list.");
            favouriteMovie.remove((intParser(commandArgument) - 1));
        }
    }

    @Override
    public String commandDescription() {
        return "Type 'removefav <movie number>' to delete a movie from favourite list. (Please type 'show' to see movie numbers.)";
    }
}
