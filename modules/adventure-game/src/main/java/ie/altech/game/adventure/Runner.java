package ie.altech.game.adventure;

import java.util.List;
import java.util.ArrayList;

import ie.altech.game.adventure.characters.Character;
import ie.altech.game.adventure.characters.King;
import ie.altech.game.adventure.characters.Knight;
import ie.altech.game.adventure.characters.Queen;
import ie.altech.game.adventure.characters.Troll;

public class Runner{

    public static void main (String ... args) {

        List<Character> characters = new ArrayList<>();
        characters.add(new Knight());
        characters.add(new King());
        characters.add(new Queen());
        characters.add(new Troll());

        System.out.println("\n--- Java application is working OK!");

        characters.stream().forEach(character -> characterDescription(character));
    }

    private static void characterDescription(Character character){
        System.out.print("\n--- ");
        character.character();
        System.out.println("      Fight with:");
        character.fight();
        System.out.println();
    }
}