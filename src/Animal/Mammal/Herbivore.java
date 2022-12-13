package Animal.Mammal;

public class Herbivore extends  Mammal {
     private String typeOfFood;

    public Herbivore(String name, int age, int speed, String liv, String typeOfFood) {
        super(name, age, speed, liv);
        this.typeOfFood = typeOfFood;
    }

    public  void goEat(){
        System.out.println("Поститься");
    }


  public void print(){
      System.out.println(
                typeOfFood + '\'' +
                super.toString());
  }
}
