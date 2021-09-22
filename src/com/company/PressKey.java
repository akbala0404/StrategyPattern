package com.company;

public class PressKey implements PressStrategy {
    @Override
    public void press() {
        System.out.println("Press the key to play the instrument");
    }
}
