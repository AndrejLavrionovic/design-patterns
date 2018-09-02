package ie.altech.strategy.ducks.behavior;

import ie.altech.strategy.ducks.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior{
    public void fly(){
        System.out.println("      > Can fly using wings!");
    }
}