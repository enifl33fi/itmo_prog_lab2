package lab2;

import ru.ifmo.se.pokemon.*;

public class Plusle extends Pokemon {
    public Plusle(String name, int level ){
        super(name, level );
        this.setStats(60.0, 50.0, 40.0, 85.0, 75.0, 95.0);
        this.setType(Type.ELECTRIC);
        this.setMove(new Swift(), new Charm(), new Thunderbolt(), new Discharge());
    }
}
