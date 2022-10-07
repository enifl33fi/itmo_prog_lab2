package lab2.Moves;

import ru.ifmo.se.pokemon.*;

public class Discharge extends SpecialMove {
    public Discharge(){
        super(Type.ELECTRIC, 80.0, 100.0);

    }
    @Override
    protected  void applyOppEffects(Pokemon def){
        if ( Math.random() < 0.3){
            Effect.paralyze(def);
        }
    }
    @Override
    protected String describe(){
        return "Использует Discharge";
    }
}