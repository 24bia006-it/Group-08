
public class vehicle{
    protected String brand;
    protected String model;
    protected int year;
    protected double price;
    
    public vehicle(String brand,String model,int year,double price){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.price=price;
        
    }
    public void displayinfo(){
        System.out.println("===vehicle information===");
        System.out.println("brand:"+brand);
        System.out.println("model:"+model);
        System.out.println("year:"+year);
        System.out.println("price:"+price);
        
    }
    public void startengine(){
        System.out.println(brand+model+"engine started");
        
    }
    public void stopengine(){
        System.out.println(brand+model+"engine stopped");
        
    }
    
}
class car extends vehicle{
    private int numdoors;
    private String fueltype;
    
    public car(String brand,String model,int year,double price,int numdoors,String fueltype){
        super(brand,model,year,price);
        this.numdoors=numdoors;
        this.fueltype=fueltype;
    }
     
    public void displayInfo(){
        super.displayInfo();
        System.out.println("doors:"+numdoors);
        System.out.println("fuel type:"+fueltype);
    }
    
    public void Honk(){
        System.out.println("opening trunk of "+brand+model);
        
    }

}
class MotorCycle extends vehicle{
    private int engineCC;
    private boolean hasHelmetStorage;

    public MotorCycle(String brand,String model,int year,double price,int engineCC,boolean hasHelmetStorage){
        super(brand,model,year,price);
        this.engineCC=engineCC;
        this.hasHelmetStorage=hasHelmetStorage;
        
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("engine:"+engineCC+"cc");
        System.out.println("HelmetStorage:"+(hasHelmetStorage?"yes":"no"));
    }    
    public void wheelie(){
        System.out.println(brand+""+model+"is doing a wheelie!");
        
    }   
    public void kickstart(){
        System.out.println("kick starting"+brand+""+model);
    }     
}
class ElectricCar extends Car{
    private double batteryCapacity;
    private int range;
    
    public ElectricCar(String brand,String model,int year,double price,int numdoors,String fueltype,double batteryCapacity,int range){
        super(brand,model,year,price,numdoors,fueltype);
        this.batteryCapacity=batteryCapacity;
        this.range=range;
    }
       
    
    @Override
    public void startengine() {
         System.out.println(brand+""+model+"electric motor activated silently"); 
 
    } 
    public void charge(){
        System.out.println("Charging " + brand + " " + model + "... Battery: " + batteryCapacity + " kWh"); 
    }
    public void displayBatteryStatus() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh"); 
        System.out.println("Range: " + range + " km"); 
        
    }
    public class Exercise12_Inheritance {
        public static void main(String[] args) {
    
 
        System.out.println("=== VEHICLE HIERARCHY TEST ===\n"); 
 
        Car car = new Car("Toyota", "Corolla", 2023, 45000000, 4, "Petrol"); 
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2022, 15000000, 500, false); 
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 2024,85000000, 4, "Electric", 75.0, 450); 
 
        System.out.println("--- Testing Car ---");         
        car.displayInfo();         
        car.startEngine();         
        car.honk();         
        car.openTrunk();         
        car.stopEngine(); 
 
        System.out.println("\n--- Testing Motorcycle ---");        
        motorcycle.displayInfo();         
        motorcycle.startEngine();        
        motorcycle.wheelie();      
        motorcycle.kickStart();        
        motorcycle.stopEngine(); 
 
        System.out.println("\n--- Testing Electric Car ---");         
        electricCar.displayInfo(); 
        electricCar.startEngine();         
        electricCar.charge();         
        electricCar.displayBatteryStatus();         
        electricCar.honk();         
        electricCar.stopEngine(); 
 
        System.out.println("\n--- Polymorphism Demo ---");         
        Vehicle[] vehicles = {car, motorcycle, electricCar};         
        for (Vehicle v : vehicles) { 
            v.displayInfo(); 
            v.startEngine(); 
            System.out.println(); 
        } 
 
        System.out.println("=== END OF TEST ==="); 
    }
    




