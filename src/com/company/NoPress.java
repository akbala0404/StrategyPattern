package com.company;

public class NoPress implements PressStrategy {
    @Override
    public void press() {
        System.out.println("This is a percussion instrument/ The instrument is not connected to electricity");
    }
}
