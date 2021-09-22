package com.company;

public class Main {

    public static void main(String[] args) {
    Instruments model= new Synthesizer();
    model.performPress();
    model.setPressStrategy(new PressElectronicKey());
    model.performPress();
    model.display();
    Instruments instruments= new Xylophone();
    instruments.performPress();
    instruments.performHit();
    instruments.display();


    }
}
