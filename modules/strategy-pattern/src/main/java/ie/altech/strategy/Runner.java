package ie.altech.strategy;

import ie.altech.strategy.ducks.MallardDuck;
import ie.altech.strategy.ducks.Duck;

public class Runner{
    public static void main(String ... args) {

        Duck mallardDuck = new MallardDuck();
        System.out.println("\n--- Java application is working OK!");
        System.out.print("\n--- ");
        mallardDuck.display();

    }
}