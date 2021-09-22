package com.company;

import java.sql.SQLOutput;

public class Piano extends Instruments{
    public Piano() {
        super(new PressKey(), new NoHit());
    }

    @Override
    void display() {
        System.out.println("Piano is playing ");
    }

}
