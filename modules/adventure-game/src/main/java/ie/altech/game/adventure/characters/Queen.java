package ie.altech.game.adventure.characters;

import ie.altech.game.adventure.characters.Character;
import ie.altech.game.adventure.weapons.BowAndArrowBehavior;

public class Queen extends Character{

    public Queen(){
        weapon = new BowAndArrowBehavior();
    }

    public void fight(){
        weapon.useWeapon();
    }

    public void character(){
        System.out.println("Queen");
    }
}