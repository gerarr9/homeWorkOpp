package Animal.Mammal;

import Animal.Animal;

public class Mammal extends Animal {
    private   int speed;
    private String liv;
    public Mammal(String name, int age,int speed , String liv) {
        super(name, age);
        this.speed = speed;
        this.liv= liv;
    }
     public void walk(){
         System.out.println("По выходным");
     }

    public int getSpeed() {
        return speed;
    }

    public String getLiv() {
        return liv;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setLiv(String liv) {
        this.liv = liv;
    }

    @Override
    public String toString() {
        return
                "speed=" + speed +
                ", liv='" + liv + '\'' +
                "} " + super.toString();
    }
}
