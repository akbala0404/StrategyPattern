package com.company;

public class Violin extends Instruments{
    public Violin() {
        super(new PressString(),new NoHit());
    }

    @Override
    void display() {
        System.out.println("Violin is playing");
    }

}
