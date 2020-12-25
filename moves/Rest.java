package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect().condition(Status.SLEEP).turns(2);
        pokemon.setCondition(effect);
        pokemon.setMod(Stat.HP, (int)(pokemon.getStat(Stat.HP)));
    }

    @Override
    protected String describe() {
        return "решил прилечь на  2 хода";
    }
}

