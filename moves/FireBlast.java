package moves;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
   public FireBlast(){
        super(Type.FIRE, 110, 85);
   }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.1);
        effect.burn(pokemon);
    }
    @Override
    protected String describe() {
        return "с трудом поджег противника";
    }
}
