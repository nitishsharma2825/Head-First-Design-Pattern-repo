package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Light light=new Light("Living room");
        CeilingFan ceilingFan=new CeilingFan("Drawing room");

        Command lightOn=new LightOnCommand(light);
        Command lightOff=new LightOffCommand(light);

        Command fanHigh=new CeilingFanHighCommand(ceilingFan);
        Command fanLow=new CeilingFanLowCommand(ceilingFan);

        RemoteControl remote=new RemoteControl();
        remote.setCommand(0,lightOn,lightOff);
        remote.setCommand(1,fanHigh,fanLow);

        remote.ButtonPressOn(0);
        remote.ButtonPressOff(0);
        remote.undoButtonPressed();

        remote.ButtonPressOn(1);
        remote.ButtonPressOff(1);
        remote.undoButtonPressed();

        Command[] commandsOn={lightOn,fanHigh};
        Command[] commandsOff={lightOff,fanLow};
        MacroCommand partyOn=new MacroCommand(commandsOn);
        MacroCommand partyOff=new MacroCommand(commandsOff);
        remote.setCommand(3,partyOn,partyOff);
        remote.ButtonPressOn(3);
        remote.ButtonPressOff(3);
    }
}
