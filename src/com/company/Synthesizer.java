package com.company;

public class Synthesizer extends Instruments{
    public Synthesizer() {
        super(new NoPress(),new NoHit());


    }

    @Override
    void display() {
        System.out.println("Synthesizer is playing");
    }

}
