package ie.altech.game.adventure.characters;

import ie.altech.game.adventure.weapons.WeaponBehavior;

public abstract class Character{
    
    WeaponBehavior weapon;

    public abstract void fight();

    public abstract void character();
}