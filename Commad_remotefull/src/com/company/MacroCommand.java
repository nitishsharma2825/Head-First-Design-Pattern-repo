package com.company;

public class MacroCommand implements  Command{
    private Command[] commands;

    public MacroCommand(Command[] c) {
        this.commands=c;
    }

    @Override
    public void execute() {
        for(Command c:commands){
            c.execute();
        }
    }

    @Override
    public void undo() {
        for(Command c:commands){
            c.undo();
        }
    }

}
