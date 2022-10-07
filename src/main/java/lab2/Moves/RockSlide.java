package lab2.Moves;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK, 75.0, 90.0);
    }
    @Override
    protected  void applyOppEffects(Pokemon def){
        if (Math.random() < 0.3){
            Effect.flinch(def);
        }
    }
    @Override
    protected String describe() {
        return "Использует Rock Slide";
    }
}