package com.company;

public class Maracas extends Instruments{
    public Maracas() {
        super(new NoPress(),new Shake());
    }

    @Override
    void display() {
        System.out.println("Maracas is playing");
    }

}
