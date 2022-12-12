public class Bus extends  Transport{
    public Bus(String brand, String model, int year, String country, String colorBody, int maxSpeed,double fuelPercentage) {
        super(brand, model, year, country, colorBody, maxSpeed,fuelPercentage);
    }
    public void refill(){
        System.out.println("Бензин или дизель");
    }
}
