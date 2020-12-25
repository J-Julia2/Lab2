package moves;

import ru.ifmo.se.pokemon.*;
 public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL,0,0);
    }
     @Override
     protected void applySelfEffects(Pokemon pokemon) {
         if (pokemon.getStat(Stat.EVASION) < 6)
             pokemon.setMod(Stat.EVASION, +1);
     }

     @Override
     protected String describe() {
         return "становиться более юрким";
     }

}
