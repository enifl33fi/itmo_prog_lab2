package lab2;

import ru.ifmo.se.pokemon.*;
public class TriAttack extends SpecialMove{
    public TriAttack(){
        super(Type.NORMAL, 80.0, 100.0);
    }
    @Override
    protected String describe(){
        return "Использует Tri Attack";
    }
    @Override
    protected  void applyOppEffects(Pokemon def){
        if (Math.random() < 0.2){
            double chanceCounter = Math.random();
            if (chanceCounter < 0.33){
                Effect.burn(def);
            }else if (chanceCounter < 0.66){
                Effect.freeze(def);
            }else {
                Effect.paralyze(def);
            }
        }

    }

}
