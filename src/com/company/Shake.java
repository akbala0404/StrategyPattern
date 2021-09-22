package com.company;

public class Shake implements HitStrategy{
    @Override
    public void hit() {
        System.out.println("Shaking");
    }
}
