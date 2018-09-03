package ie.altech.strategy.ducks;

import ie.altech.strategy.ducks.behavior.FlyNoWay;
import ie.altech.strategy.ducks.behavior.Squeek;

public class RubberDuck extends Duck{

    public RubberDuck(){
        quackBehavior = new Squeek();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("This is RubberDuck!");
    }
}