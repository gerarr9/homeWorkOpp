package Animal;

public class Amphibian extends  Animal{
    private String liv;
    public Amphibian(String name, int age,String liv ){
        super(name, age);
        this.liv = liv;
    }

    public String getLiv() {
        return liv;
    }

    public void setLiv(String liv) {
        this.liv = liv;
    }

    public void hunt(){
        System.out.println("Охотиться");
    }


    @Override
    public String toString() {
        return "amphibians{" +
                "liv='" + liv + '\'' +
                "} " + super.toString();
    }
}
