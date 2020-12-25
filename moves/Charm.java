package moves;

import ru.ifmo.se.pokemon.*;

public class Charm extends StatusMove {
    public Charm(){
        super(Type.FAIRY,0,100);
        }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (pokemon.getStat(Stat.ATTACK) > -5){
            pokemon.setMod(Stat.ATTACK, -2);
        }
    }
    @Override
    protected String describe() {
        return "очаровал соперника";
    }

}
