package com.company;

public class HitWithaStick implements HitStrategy{
    @Override
    public void hit() {
        System.out.println("Blow with a stick to play an instrument");
    }
}
