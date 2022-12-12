import java.text.DecimalFormat;

public class Train extends Transport {
    private int priceTrip;
    private int timeTrip;
    private  String startPoint;
    private  String endPoint;
    private  int numberWagons;


    public Train(String brand, String model, int year, String country, String colorBody,  int maxSpeed,
                 int priceTrip, int timeTrip, String startPoin, String endPoint, int numberWagons,double fuelPercentage) {
        super(brand, model, year, country, colorBody, maxSpeed,fuelPercentage);
        this.startPoint = startPoin;
        this.priceTrip = priceTrip;
        setTimeTrip(timeTrip);
        this.endPoint = endPoint;
        this.numberWagons = numberWagons;
    }

    public  void refill(){
        System.out.println("Дизель");
    }
    public int getPriceTrip() {
        return priceTrip;
    }

    public int getTimeTrip() {
        return timeTrip;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public int getNumberWagons() {
        return numberWagons;
    }

    public void setPriceTrip(int priceTrip) {
        this.priceTrip = priceTrip;
    }

    public void setTimeTrip(int timeTrip) {
        if (timeTrip <=0){
            timeTrip =20;
        }
        this.timeTrip = timeTrip;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public void setNumberWagons(int numberWagons) {
        this.numberWagons = numberWagons;
    }

    public  void  print(){
        System.out.println(getBrand()+" " + getColorBody()+" "+getModel()+" "+getYear()+" "+getCountry()+" "+getMaxSpeed()+" "+getStartPoint()+" "+getEndPoint()+" "+getTimeTrip()+" "+getPriceTrip()
                +" "+getNumberWagons()+" "+"Бензина "+String.format ("%.2f",getFuelPercentage())+"%");
    }

}
