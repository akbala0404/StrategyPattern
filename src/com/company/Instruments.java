package com.company;

public abstract class Instruments {
    private PressStrategy pressStrategy;
    private HitStrategy hitStrategy;


    public void setPressStrategy(PressStrategy pressStrategy) {
        this.pressStrategy = pressStrategy;
    }

    public void setHitStrategy(HitStrategy hitStrategy) {
        this.hitStrategy = hitStrategy;
    }


    public PressStrategy getPressStrategy() {
        return pressStrategy;
    }

    public HitStrategy getHitStrategy() {
        return hitStrategy;
    }

public Instruments(PressStrategy pressStrategy, HitStrategy hitStrategy){
        this.hitStrategy=hitStrategy;
        this.pressStrategy=pressStrategy;
}
    abstract void display();

    void performPress(){
        this.pressStrategy.press();
    }
    void performHit(){
        this.hitStrategy.hit();
    }

}
