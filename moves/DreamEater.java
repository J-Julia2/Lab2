package moves;
import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        Status fil = pokemon.getCondition();
        if (fil.equals(Status.SLEEP)) {
            pokemon.setMod(Stat.HP, (int) Math.round(damage));
        }
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {

        pokemon.setMod(Stat.HP, (int) (pokemon.getStat(Stat.HP))/2);
    }
    @Override
    protected String describe() {
        return "Нападает на спящего  и востанавливает своё здоровье";
    }
}
