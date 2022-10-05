package lab2;

import ru.ifmo.se.pokemon.*;

public class Charm extends StatusMove {
    public Charm(){
        super(Type.FAIRY,0.0, 100.0);
    }
    @Override
    protected  void applyOppEffects(Pokemon def){
        def.setMod(Stat.ATTACK, -2);
    }
    @Override
    protected String describe(){

        return "Использует Charm";
    }
}
