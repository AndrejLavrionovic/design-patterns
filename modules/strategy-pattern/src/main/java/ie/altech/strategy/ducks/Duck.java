package ie.altech.strategy.ducks;

import ie.altech.strategy.ducks.behavior.FlyBehavior;
import ie.altech.strategy.ducks.behavior.QuackBehavior;

public abstract class Duck{

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("      Can swim!");
    }
}