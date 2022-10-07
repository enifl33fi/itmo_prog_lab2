package lab2.Moves;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb(){
        super(Type.ROCK, 60.0, 95.0);
    }
    @Override
    protected  void applyOppEffects(Pokemon def){
        def.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe() {
        return "Использует Rock Tomb";
    }
}