package com.canberksinangil;

public interface Command {

    public void execute(String commandArgument);

    public String commandDescription();
}
