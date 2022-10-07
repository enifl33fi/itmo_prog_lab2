package lab2;

import lab2.Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        var p1 = new Porygon("Кирилл Марков", 50);
        var p2 = new Plusle("Олеся Журавлева", 31);
        var p3 = new Pansage("Роман Макеев", 22);
        var p4 = new Simisage("Егор Соколов", 1);
        var p5 = new Porygon2("Инна Соммерфельд", 50);
        var p6 = new PorygonZ("Михаил Начинкин", 50);
        Battle b = new Battle();
        b.addAlly(p6);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p1);
        try {
            b.go();
        } catch (Exception e) {
            System.out.println("not enough pokemons");
        }

    }
}
