package com.interface_prac;

public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRing;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Always on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Dialing");
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
