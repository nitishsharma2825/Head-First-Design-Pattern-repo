package com.interface_prac;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRing;
    private boolean isOn=false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("Phone on");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) System.out.println("Dialing");
        else System.out.println("Phone Off");
    }

    @Override
    public void answer() {
        if(isRing){
            System.out.println("Answering");
            isRing=false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            isRing=true;
            System.out.println("Ringing");
        } else {
            isRing=false;
        }
        return isRing;
    }

    @Override
    public boolean isRinging() {
        return isRing;
    }
}
