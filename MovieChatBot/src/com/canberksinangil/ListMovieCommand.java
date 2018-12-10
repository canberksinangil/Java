package com.canberksinangil;

public class ListMovieCommand extends CommandBase implements Command {

    public ListMovieCommand(String commandKeyword) {
        super(commandKeyword);
    }

    @Override
    public void execute(String commandArgument) {
        int counter = 1;
        for (String movieName : movie) {
            System.out.println(counter + ". " + movieName);
            counter++;
        }
    }

    @Override
    public String commandDescription() {
        return "Type 'show' to list all movies.";
    }
}
