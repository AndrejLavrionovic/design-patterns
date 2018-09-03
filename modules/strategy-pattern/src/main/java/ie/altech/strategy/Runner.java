package ie.altech.strategy;

import ie.altech.strategy.ducks.MallardDuck;
import ie.altech.strategy.ducks.RedheadDuck;
import ie.altech.strategy.ducks.RubberDuck;

import java.util.ArrayList;
import java.util.List;

import ie.altech.strategy.ducks.DecoyDuck;
import ie.altech.strategy.ducks.Duck;

public class Runner{

    static List<Duck> ducks = new ArrayList<>();

    public static void main(String ... args) {

        ducks.add(new MallardDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new RubberDuck());
        ducks.add(new DecoyDuck());

        System.out.println("\n--- Java application is working OK!");

        ducks.stream().forEach(duck -> duckDescription(duck));
    }

    private static void duckDescription(Duck duck){
        System.out.print("\n--- ");
        duck.display();
        System.out.println("      Flying Skills:");
        duck.performFly();
        System.out.println("      Make sound:");
        duck.performQuack();
        duck.swim();
        System.out.println();
    }
}