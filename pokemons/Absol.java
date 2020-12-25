package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Absol extends Pokemon {
    public Absol(String name, int level){
        super(name, level);
        double 	hp=65,
                attack=130,
                defense=60,
                specialAttack=75,
                specialDefense=60,
                speed=75;
        setType(Type.DARK);
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);
        setMove(new FireBlast(), new Rest(), new DreamEater(), new PlayRough());
    }
}
