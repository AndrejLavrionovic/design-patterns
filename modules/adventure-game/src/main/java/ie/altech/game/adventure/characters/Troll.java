package ie.altech.game.adventure.characters;

import ie.altech.game.adventure.characters.Character;
import ie.altech.game.adventure.weapons.AxeBehavior;

public class Troll extends Character{

    public Troll(){
        weapon = new AxeBehavior();
    }

    public void fight(){
        weapon.useWeapon();
    }

    public void character(){
        System.out.println("Troll");
    }
}