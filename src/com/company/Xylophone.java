package com.company;

public class Xylophone extends Instruments{
    public Xylophone() {
        super(new PressKey(), new HitWithaStick());
    }

    @Override
    void display() {
        System.out.println("Xylophone is playing");
    }

}
