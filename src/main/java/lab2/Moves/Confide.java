package lab2.Moves;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide(){
        super(Type.NORMAL, 0.0, 100.0);

    }
    @Override
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    @Override
    protected String describe() {
        return "Использует Confide";
    }
}
