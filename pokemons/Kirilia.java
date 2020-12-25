package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Kirilia extends Ralts{
    public Kirilia(String name, int level){
        super(name, level);
        double 	hp=38,
                attack=35,
                defense=35,
                specialAttack=65,
                specialDefense=55,
                speed=50;
        setType(Type.PSYCHIC, Type.FAIRY);
        setStats(hp, attack, defense, specialAttack, specialDefense, speed);
        setMove(new ChargeBeam(), new Rest(), new Charm());
    }
}
