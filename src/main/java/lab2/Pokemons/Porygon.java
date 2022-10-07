package lab2.Pokemons;

import lab2.Moves.SignalBeam;
import lab2.Moves.TriAttack;
import ru.ifmo.se.pokemon.*;

public class Porygon extends Pokemon {
    public Porygon(String name, int level ){
        super(name, level);
        this.setStats(65.0, 60.0, 70.0, 85.0, 75.0, 40.0);
        this.setType(Type.NORMAL);
        this.setMove(new SignalBeam(), new TriAttack());
    }
}
