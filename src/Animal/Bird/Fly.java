package Animal.Bird;

import Animal.Animal;

public class Fly extends Bird {
    public Fly(String name, int age, String liv, String movement) {
        super(name, age, liv, movement);
    }

    public void walk(){
        System.out.println("Летают");
    }
}
