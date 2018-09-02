package ie.altech.strategy.ducks;

import ie.altech.strategy.ducks.Duck;
import ie.altech.strategy.ducks.behavior.FlyBehavior;
import ie.altech.strategy.ducks.behavior.FlyWithWings;
import ie.altech.strategy.ducks.behavior.QuackBehavior;
import ie.altech.strategy.ducks.behavior.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("This is Mallard duck!");
    }
}