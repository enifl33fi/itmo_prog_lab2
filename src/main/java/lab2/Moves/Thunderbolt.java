package lab2.Moves;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public  Thunderbolt(){
        super(Type.ELECTRIC, 90.0, 100.0);

    }
    @Override
    protected  void applyOppEffects(Pokemon def){
        if (Math.random() < 0.1){
            Effect.paralyze(def);
        }
    }
    @Override
    protected String describe(){
        return "Использует Thunderbolt";
    }
}
