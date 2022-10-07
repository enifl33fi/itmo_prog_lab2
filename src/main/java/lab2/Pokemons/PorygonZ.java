package lab2.Pokemons;

import lab2.Moves.Confide;

public class PorygonZ extends Porygon2 {
    public PorygonZ(String name, int level) {
        super(name, level);
        this.setStats(85.0, 80.0, 70.0, 135.0, 75.0, 90.0);
        this.addMove(new Confide());
    }
}