package lab2;

import ru.ifmo.se.pokemon.*;

public class SeedBomb extends PhysicalMove {
    public SeedBomb(){
        super(Type.GRASS, 80.0, 100.0);
    }
    @Override
    protected String describe() {
        return "Использует Seed Bomb";
    }
}

