public class Transport {
    private   String brand;
    private  String model;
    private final int year;
    private final String country;
    private  String colorBody;
    private  int maxSpeed;
    private  double fuelPercentage;

    private  String refill;



    public Transport(String brand, String model, int year, String country, String colorBody, int maxSpeed,double fuelPercentage) {
        setFuelPercentage(fuelPercentage);
        setBrand(brand);
        setModel(model);
        this.year = year;
        this.country = country;
        setColorBody(colorBody);
        setMaxSpeed(maxSpeed);
    }


    public  void refill(){
        System.out.println("Бензин");
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColorBody() {
        return colorBody;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setColorBody(String colorBody) {
        if (colorBody == null || colorBody.isEmpty()){
            colorBody = "defalt";
        }
        this.colorBody = colorBody;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <=0){
            maxSpeed = 60;
        }
        this.maxSpeed = maxSpeed;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()){
            brand = "defalt";
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()){
            model = "defalt";
        }
        this.model = model;
    }

    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage<=0){
            fuelPercentage = Math.random()*100;
        }
        this.fuelPercentage = fuelPercentage;
        fuelPercentage = Math.random()*100;
    }

    public void print(){
        System.out.println("Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", colorBody='" + colorBody + '\'' +
                ", maxSpeed=" + maxSpeed +'\''
                +"Бензина "+ String.format("%.2f",fuelPercentage) +"%" +
                '}');
    }
}



