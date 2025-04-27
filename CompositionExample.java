class Car{
	String model;
	String brand;
	String color;
	int capacity;
    String type;
    double price;
    Engine engine=new Engine("SI",13,180,4,2100);   
    Car(String brand,String model ,String color ,int capacity ,String type,double price){
         super();
         this.brand=brand;
         this.model=model;
         this.color=color;
         this.capacity=capacity;
         this.type=type;
         this.price=price;
    }
    public void displayCar(){
    	System.out.println("Car details :");
    	System.out.println("Brand : "+brand);
    	System.out.println("Color of car : "+color);
    	System.out.println("Type of car : "+type);
    	System.out.println("Passenger capacity : "+capacity);
    	System.out.println("Price : "+price);
    }
}
class Engine{
	String engineType;
	double mileage;
	double bhp;
	int noOfPistons;
	double cc;

   Engine(String engineType,double mileage,double bhp ,int noOfPistons,double cc){
      super();
      this.engineType=engineType;
      this.mileage=mileage;
      this.bhp=bhp;
      this.noOfPistons=noOfPistons;
      this.cc=cc;
   }
   public void displayEngine(){
   	  System.out.println("Engine details : ");
   	  System.out.println("Type of engine : "+engineType);
   	  System.out.println("Brake Horsepower : "+bhp);
   	  System.out.println("no of pistons : "+noOfPistons);
   	  System.out.println("Mileage : "+mileage);
   	  System.out.println("Cubic capacity : "+cc);
   }

}
class CompositionExample{
	public static void main(String[] args) {
		  Car car =new Car("TATA","HARRIER","BLACK",5,"SUV",2400000);
		  car.displayCar();
		  car.engine.displayEngine();
	}
}