package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Gardevoir extends Kirilia{
    public Gardevoir (String name, int level){
        super(name, level);
        double 	hp=68,
                attack=65,
                defense=65,
                specialAttack=125,
                specialDefense=115,
                speed=80;
        setType(Type.PSYCHIC, Type.FAIRY);
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);
        setMove(new ChargeBeam(), new Rest(), new Charm(), new DisarmingVoice());
    }
}
