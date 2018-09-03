package ie.altech.strategy.ducks.behavior;

import ie.altech.strategy.ducks.behavior.QuackBehavior;

public class Squeek implements QuackBehavior{

    public void quack(){
        System.out.println("      > Squeek!");
    }
}