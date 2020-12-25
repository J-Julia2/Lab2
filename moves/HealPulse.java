package moves;

import ru.ifmo.se.pokemon.*;

public class HealPulse extends StatusMove {
    public HealPulse(){
        super(Type.PSYCHIC, 0 ,0);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, (int)(pokemon.getStat(Stat.HP))/2);
    }

    @Override
    protected String describe() {
        return "Исцеляет себя на 50% от своего максимума";
    }
}
