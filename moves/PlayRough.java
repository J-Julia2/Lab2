package moves;

import ru.ifmo.se.pokemon.*;

public class PlayRough extends PhysicalMove {
    public PlayRough(){
        super(Type.FAIRY, 90, 90);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (pokemon.getStat(Stat.ATTACK) >-6){
            pokemon.setMod(Stat.ATTACK, -1);
        }
    }
    @Override
    protected String describe() {
        return "поднял руку ";
    }
}
