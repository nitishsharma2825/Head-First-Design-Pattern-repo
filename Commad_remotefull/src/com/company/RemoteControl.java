package com.company;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        this.offCommands=new Command[7];
        this.onCommands=new Command[7];
        Command noCommand=new NoCommand();
        for(int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        undoCommand=noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }

    public void ButtonPressOn(int slot){
        undoCommand=onCommands[slot];
        onCommands[slot].execute();
    }
    public void ButtonPressOff(int slot){
        undoCommand=offCommands[slot];
        offCommands[slot].execute();
    }
    public void undoButtonPressed(){
        undoCommand.undo();
    }
}
