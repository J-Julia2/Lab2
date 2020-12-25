package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Chingling extends Pokemon {
    public Chingling (String name, int level){
        super(name, level);
        double 	hp=45,
                attack=30,
                defense=50,
                specialAttack=65,
                specialDefense=50,
                speed=45;
        setType(Type.PSYCHIC);
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);
        setMove(new DoubleTeam(), new Astonish(), new CalmMind());
    }
}
