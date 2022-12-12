package Animal.Mammal;

import Animal.Animal;

import java.util.Objects;

public class Predator extends Mammal{
    private String typeOfFood;
    public Predator(String name, int age, int speed, String liv,String typeOfFood) {
        super(name, age, speed, liv);
        this.typeOfFood = typeOfFood;
    }
    public void hunt(){
        System.out.println("Охотиться");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeOfFood, predator.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }

    public void print(){
        System.out.println(
                typeOfFood + '\'' +
                        super.toString());
    }
}
