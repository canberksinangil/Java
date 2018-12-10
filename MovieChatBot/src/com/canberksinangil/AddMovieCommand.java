package com.canberksinangil;

public class AddMovieCommand extends CommandBase implements Command {

    public AddMovieCommand(String commandKeyword) {
        super(commandKeyword);
    }

    @Override
    public void execute(String commandArgument) {

        if (!isThisMovieExist(commandArgument)) {
            movie.add(commandArgument);
            System.out.println("Movie = " + commandArgument + " added.");
        }
    }

    @Override
    public String commandDescription() {
        return "Type 'add <movie name>' to add a movie.";
    }
}
