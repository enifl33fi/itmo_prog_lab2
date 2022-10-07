package lab2;

import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Porygon p1 = new Porygon("Кирилл Марков", 50);
        Plusle p2 = new Plusle("Олеся Журавлева", 31);
        Pansage p3 = new Pansage("Роман Макеев", 22);
        Simisage p4 = new Simisage("Егор Соколов", 22);
        Porygon2 p5 = new Porygon2("Инна Соммерфельд", 50);
        PorygonZ p6 = new PorygonZ("Михаил Начинкин", 50);
        Battle b = new Battle();
        b.addAlly(p6);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p1);
        try {
            b.go();
        } catch (Exception e){
            System.out.println("not enough pokemons");
        }

    }
}
