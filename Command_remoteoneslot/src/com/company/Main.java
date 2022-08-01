package com.company;

public class Main {
    public static void main(String[] args) {
        Light light=new LivingLight();
        Command command = new LightOnCommand(light);
        SimpleRemoteControl remote=new SimpleRemoteControl();
        remote.setCommand(command);
        remote.buttonPressedOn();

    }
}
