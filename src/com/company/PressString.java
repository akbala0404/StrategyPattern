package com.company;

public class PressString implements PressStrategy{
    @Override
    public void press() {
        System.out.println("Press the string to play the instrument");
    }
}
