package Animal.Bird;

import Animal.Animal;

public abstract class  Bird extends Animal {
    private String liv;
    private String movement;
    public Bird(String name, int age,String liv,String movement) {
        super(name, age);
        this.liv = liv;
        this.movement =movement;
    }
    public void hunt(){
        System.out.println("Охотиться");
    }
}
