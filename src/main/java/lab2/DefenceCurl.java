package lab2;

import ru.ifmo.se.pokemon.*;

public class DefenceCurl extends StatusMove {
    public DefenceCurl(){
        super(Type.NORMAL, 0.0, 100.0);
    }
    @Override
    protected void applySelfEffects(Pokemon att){
        att.setMod(Stat.DEFENSE, 1);
    }
    @Override
    protected String describe() {
        return "Использует Defence Curl";
    }
}
