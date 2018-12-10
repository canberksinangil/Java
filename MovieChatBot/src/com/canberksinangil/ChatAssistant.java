package com.canberksinangil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChatAssistant {

    private Map<String, Command> commandList = new HashMap<>();

    public ChatAssistant() {

        // For Movies
        commandList.put("add", new AddMovieCommand("add"));
        commandList.put("remove", new RemoveMovieCommand("remove"));
        commandList.put("show", new ListMovieCommand("show"));

        // For favourite
        commandList.put("addfav", new AddToFavouriteCommand("addfav"));
        commandList.put("showfav", new ListFavouriteMovieList("showfav"));
        commandList.put("removefav", new RemoveFromFavouriteCommand("removefav"));

        // For terminate
        commandList.put("exit", new ExitCommand("exit"));
    }

    public void startChat() {
        System.out.println("Your Movie List Assistant is ready.");
        printCommandsAsList();
        Scanner myScanner = new Scanner(System.in);
        while (myScanner.hasNextLine()) {
            String myInput = myScanner.nextLine();
            String[] myInputAsToken = myInput.toLowerCase().split(" ");
            if (commandList.containsKey(myInputAsToken[0])) {
                Command givenCommand = commandList.get(myInputAsToken[0]);
                String commandArgument = myInputAsToken.length > 1 ? myInputAsToken[1] : "";
                givenCommand.execute(commandArgument);
            } else {
                System.out.printf("Unknown command. Please check the command list bellow.");
                printCommandsAsList();
            }
        }
    }

    private void printCommandsAsList() {
        for (String commandName : commandList.keySet()) {
            System.out.println(commandList.get(commandName).commandDescription());
        }
    }
}