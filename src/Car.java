public class Car extends Transport{
    public Car(String brand, String model, int year, String country, String colorBody, int maxSpeed,double fuelPercentage) {
        super(brand, model, year, country, colorBody, maxSpeed,fuelPercentage);
    }
    public  void refill(){
        System.out.println("бензином, дизелем на заправке или заряжать на специальных электропарковках");
    }
}
