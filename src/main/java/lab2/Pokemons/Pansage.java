package lab2.Pokemons;

import lab2.Moves.FurySwipes;
import lab2.Moves.RockTomb;
import lab2.Moves.SeedBomb;
import ru.ifmo.se.pokemon.*;

public class Pansage extends Pokemon {
    public Pansage(String name, int level){
        super(name, level);
        this.setStats(50.0, 53.0, 48.0, 53.0, 48.0, 64.0);
        this.setType(Type.GRASS);
        this.setMove(new FurySwipes(), new RockTomb(), new SeedBomb());
    }
}
