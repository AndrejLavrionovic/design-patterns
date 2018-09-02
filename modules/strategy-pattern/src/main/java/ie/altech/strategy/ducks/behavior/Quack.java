package ie.altech.strategy.ducks.behavior;

import ie.altech.strategy.ducks.behavior.QuackBehavior;

public class Quack implements QuackBehavior{
    public void quack(){
        System.out.println("      > Quack!");
    }
}