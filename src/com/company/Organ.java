package com.company;

public class Organ extends Instruments{
    public Organ() {
        super(new PresslKeyWithPedal(),new NoHit());
    }

    @Override
    void display() {
        System.out.println("Organ is playing");
    }

}
