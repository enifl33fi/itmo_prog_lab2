package lab2;

public class Porygon2 extends Porygon {
    public Porygon2(String name, int level) {
        super(name, level);
        this.setStats(85.0, 80.0, 90.0, 105.0, 95.0, 60.0);
        this.addMove(new DefenceCurl());

    }
}

