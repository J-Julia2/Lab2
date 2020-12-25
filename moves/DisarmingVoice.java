package moves;

import ru.ifmo.se.pokemon.*;

public class DisarmingVoice extends SpecialMove {
    public DisarmingVoice(){
        super(Type.FAIRY, 40,100000/*Infinity*/ );
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        pokemon.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected String describe() {
        return "обезаружил своим голосом";
    }
}
