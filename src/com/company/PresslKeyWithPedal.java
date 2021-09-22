package com.company;

public class PresslKeyWithPedal implements PressStrategy {
    @Override
    public void press() {
        System.out.println("Press the key and the pedal to play the instrument");
    }
}
