package com.company;

public class NoHit implements HitStrategy {
    @Override
    public void hit() {
        System.out.println("This is a keyboard instrument");
    }
}
