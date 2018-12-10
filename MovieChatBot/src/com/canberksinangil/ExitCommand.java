package com.canberksinangil;

//Tested

public class ExitCommand extends CommandBase implements Command {

    public ExitCommand(String commandKeyword) {
        super(commandKeyword);
    }

    @Override
    public void execute(String commandArgument) {
        System.out.println("Have a good day!");
        System.exit(0);

    }

    @Override
    public String commandDescription() {
        return "Type 'exit' to terminate the Movie Chat Assistant.";
    }
}
