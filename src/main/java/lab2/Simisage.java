package lab2;

public class Simisage extends Pansage {
    public Simisage(String name, int level) {
        super(name, level);
        this.setStats(75.0, 98.0, 63.0, 98.0, 63.0, 101.0);
        this.addMove(new RockSlide());
    }
}
