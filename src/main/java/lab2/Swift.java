package lab2;

import ru.ifmo.se.pokemon.*;

public class Swift extends SpecialMove {
    public Swift(){
        super(Type.NORMAL, 60.0, Double.POSITIVE_INFINITY);
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }
    @Override
    protected String describe(){
        return "Использует Swift";
    }
}