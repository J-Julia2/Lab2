import ru.ifmo.se.pokemon.*;
import pokemons.*;
public class Main {

        public static void main(String[] args){
                Battle b = new Battle();
                Absol absol = new Absol("Шкипер",20);
                Chingling chingling = new Chingling("Ковальски",26);
                Chimecho chimecho = new Chimecho("Прапор",19);
                Ralts ralts = new Ralts("Джулиан",15);
                Kirilia kirilia = new Kirilia("Морис",30);
                Gardevoir gardevoir = new Gardevoir("Морт",25);

                b.addAlly(absol);
                b.addAlly(chingling);
                b.addAlly(chimecho);
                b.addFoe(ralts);
                b.addFoe(kirilia);
                b.addFoe(gardevoir);
                b.go();
        }

}
