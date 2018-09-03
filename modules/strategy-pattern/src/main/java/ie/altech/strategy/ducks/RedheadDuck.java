package ie.altech.strategy.ducks;

import ie.altech.strategy.ducks.Duck;
import ie.altech.strategy.ducks.behavior.FlyWithWings;
import ie.altech.strategy.ducks.behavior.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("This is RedheadDuck!");
    }
}