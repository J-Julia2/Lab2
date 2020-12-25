package moves;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends PhysicalMove {
    public CalmMind(){
        super();
        type=Type.PSYCHIC;
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (pokemon.getStat(Stat.SPECIAL_ATTACK) < 6){
            pokemon.setCondition(new Effect().stat(Stat.SPECIAL_ATTACK,+1));
        }
        if (pokemon.getStat(Stat.SPECIAL_DEFENSE) < 6){
            pokemon.setCondition(new Effect().stat(Stat.SPECIAL_DEFENSE,+1));
        }
    }
    @Override
    protected String describe() {
        return "прокачал скиллы";
    }

}
