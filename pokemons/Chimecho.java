package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Chimecho extends Pokemon {
    public Chimecho(String name, int level){
        super(name, level);
        double 	hp=75,
                attack=50,
                defense=80,
                specialAttack=95,
                specialDefense=90,
                speed=65;
        setType(Type.PSYCHIC);
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);
        setMove(new DoubleTeam(), new Astonish(), new CalmMind(), new HealPulse());
    }
}

