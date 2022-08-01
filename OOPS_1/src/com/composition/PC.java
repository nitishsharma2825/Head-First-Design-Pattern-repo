package com.composition;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(String a){
        this.getTheCase().pressPowerButton();
        drawLogo();
        getMotherboard().loadProgram(a);
    }
    private void drawLogo(){
        getMonitor().drawPixel();
    }
    private Case getTheCase() {
        return theCase;
    }
    private Monitor getMonitor() {
        return monitor;
    }
    private Motherboard getMotherboard() {
        return motherboard;
    }
}
