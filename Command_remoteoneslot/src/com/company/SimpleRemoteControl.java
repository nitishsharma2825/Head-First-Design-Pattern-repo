package com.company;

public class SimpleRemoteControl {
    private Command slot1;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command){
        this.slot1=command;
    }

    public void buttonPressedOn(){
        slot1.execute();
    }
}
