package ie.altech.game.adventure.characters;

import ie.altech.game.adventure.characters.Character;
import ie.altech.game.adventure.weapons.KnifeBehavior;

public class King extends Character{

    public King(){
        weapon = new KnifeBehavior();
    }

    public void fight(){
        weapon.useWeapon();
    }

    public void character(){
        System.out.println("King");
    }
}