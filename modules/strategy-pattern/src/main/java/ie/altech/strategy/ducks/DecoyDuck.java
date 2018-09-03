package ie.altech.strategy.ducks;

import ie.altech.strategy.ducks.behavior.FlyNoWay;
import ie.altech.strategy.ducks.behavior.MuteQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("This is DecoyDuck!");
    }
}