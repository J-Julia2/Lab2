package moves;

import ru.ifmo.se.pokemon.*;

public class Astonish extends PhysicalMove {
    public Astonish(){
        super(Type.GHOST, 30, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) Math.round(v));
        if (Math.random()<=0.3){
            Effect.flinch(pokemon);
        }
    }
    @Override
    protected String describe() {
        return "заставил противника вздрогнуть";
    }
}
