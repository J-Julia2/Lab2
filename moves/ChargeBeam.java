package moves;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(){
        super(Type.ELECTRIC,50, 90);
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
            pokemon.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (pokemon.getStat(Stat.SPECIAL_ATTACK) < 6){
            pokemon.setCondition(new Effect().stat(Stat.SPECIAL_ATTACK,+1).chance(0.7));
        }
    }
    @Override
    protected String describe() {
        return "облучает противника и и повышает свою квалификацию";
    }
}
