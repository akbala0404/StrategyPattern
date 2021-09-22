package com.company;

public class PressElectronicKey implements PressStrategy{
    @Override
    public void press() {
        System.out.println("The instrument is connected to electricity. Press the key to play the instrument");
    }
}
