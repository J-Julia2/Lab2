package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Ralts extends Pokemon{
    public Ralts(String name, int level){
        super(name, level);
        double 	hp=28,
                attack=25,
                defense=25,
                specialAttack=45,
                specialDefense=35,
                speed=40;
        setType(Type.PSYCHIC, Type.FAIRY);
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);
        setMove(new ChargeBeam(), new Rest());
    }
}
