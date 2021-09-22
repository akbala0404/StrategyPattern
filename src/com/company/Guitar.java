package com.company;

public class Guitar extends Instruments{
    public Guitar(){
        super(new PressString(),new NoHit());
    }
    @Override
    void display() {
        System.out.println("Guitar is playing");
    }

}
