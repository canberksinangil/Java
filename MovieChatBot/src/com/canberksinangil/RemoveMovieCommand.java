package com.canberksinangil;

public class RemoveMovieCommand extends CommandBase implements Command {

    public RemoveMovieCommand(String commandKeyword) {
        super(commandKeyword);
    }

    @Override
    public void execute(String commandArgument) {

        if (movieBoundChecker(commandArgument)) {
            System.out.println("Movie removed from your  movie list. Please type 'show' to see your new list.");
            movie.remove((intParser(commandArgument) - 1));
        }
    }

    @Override
    public String commandDescription() {
        return "Type 'remove <movie number>' to delete a movie. (Please type 'show' to see movie numbers.)";
    }
}
