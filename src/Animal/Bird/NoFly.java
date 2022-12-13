package Animal.Bird;

public class NoFly extends  Bird{
    public NoFly(String name, int age, String liv,String movement) {
        super(name, age, liv,movement);

    }
    public void walk(){
        System.out.println("Земля");
    }

}
