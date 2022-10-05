package lab2;

import ru.ifmo.se.pokemon.*;

public class SignalBeam extends SpecialMove {
    public SignalBeam(){
        super(Type.BUG, 75.0, 100.0);
    }
    @Override
    protected String describe(){
        return "Использует Signal Beam";
    }
    @Override
    protected  void applyOppEffects(Pokemon def){
        if (Math.random() < 0.1){
            Effect.confuse(def);
        }
    }

}