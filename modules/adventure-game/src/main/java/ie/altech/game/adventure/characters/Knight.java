package ie.altech.game.adventure.characters;

import ie.altech.game.adventure.characters.Character;
import ie.altech.game.adventure.weapons.SwordBehavior;

public class Knight extends Character{

    public Knight(){
        weapon = new SwordBehavior();
    }

    public void fight(){
        weapon.useWeapon();
    }

    public void character(){
        System.out.println("Knight");
    }
}