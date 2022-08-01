package com.interface_prac;

public interface ITelephone {

    // public doesn't matter
    public void powerOn();
    public void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
