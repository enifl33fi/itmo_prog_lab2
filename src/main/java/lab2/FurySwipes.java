package lab2;

import ru.ifmo.se.pokemon.*;

public class FurySwipes extends PhysicalMove {
    public FurySwipes(){
        super(Type.NORMAL, 18.0, 80.0);
    }
    @Override
    protected String describe() {
        return "Использует Fury Swipes";
    }

    protected  static int getNumberOfHits(){
        int hits;
        double chanceCounter = Math.random();
        if (chanceCounter < 0.375){
            hits = 2;
        }
        else if (chanceCounter < 0.75){
            hits = 3;
        }
        else if (chanceCounter < 0.875){
            hits = 4;
        }
        else {
            hits = 5;
        }
        return hits;
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        int hits = getNumberOfHits();
        def.setMod(Stat.HP, (hits * (int) Math.round(damage)));
    }
}
