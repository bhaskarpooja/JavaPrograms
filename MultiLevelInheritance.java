class LivingBeing{
	String name;
	int age;  
	double height;  
	double weight;  
	String habitat ; 

	LivingBeing(String name,int age,double height,double weight,String habitat){
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.habitat=habitat;
	}
	public void displayLivingBeing(){
         System.out.println("*** LIVING BEING ***");
         System.out.println("Name : "+name);
         System.out.println("Age : "+age);
         System.out.println("Height : "+height);
         System.out.println("Weight : "+weight);
         System.out.println("Habitat : "+habitat);
	}
}
class Animal extends LivingBeing{  
	String species; 
	boolean isCarnivore;  
	int numberOfLegs;  
	String sound ; 
    String color ; 
    
    Animal(String species,boolean isCarnivore,int numberOfLegs,String sound,String color
           ,String name,int age,double height,double weight,String habitat){
    	super(name,age,height,weight,habitat);
    	this.species=species;
    	this.isCarnivore=isCarnivore;
    	this.numberOfLegs=numberOfLegs;
    	this.sound=sound;
    	this.color=color;
    }
    public void displayAnimal(){
        System.out.println("***    ANIMAL  ***");
        System.out.println("species : "+species);
        System.out.println("is Carnivore ? "+isCarnivore);
        System.out.println("Number of legs : "+numberOfLegs);
        System.out.println("Sound  : "+sound);
        System.out.println("Color : "+color);
    }
}
class Dog extends Animal{
	String breed; 
	String coatPattern; 
	String color;  
	int ageInYears;
	String trainingType; 	

	Dog(String breed,String coatPattern,String color,int ageInYears,String trainingType
        ,String species,boolean isCarnivore,int numberOfLegs,String sound,String color1
        ,String name,int age,double height,double weight,String habitat){
	   super(species,isCarnivore,numberOfLegs,sound,color1,name ,age, height,weight,habitat);
       this.breed=breed;
       this.coatPattern=coatPattern;
       this.color=color;
       this.ageInYears=ageInYears;
       this.trainingType=trainingType;
	}
	public void displayDog(){
		System.out.println("***        DOG         ***");
		System.out.println("breed  : "+ breed);
		System.out.println("coat Pattern :  "+ coatPattern);
		System.out.println("color : "+ color);
		System.out.println("training Type : "+ trainingType);
		System.out.println("age : "+ ageInYears);
	}
}

class MultiLevelInheritance{
	public static void main(String[] args) {
		Dog object =new Dog("Labrador Retriever","Solid","Yellow", 3," Obedience",
	                        "canine",true,4,"Bark","Brown", "bella", 5,1.5,30.0,"Domestic");
		object.displayLivingBeing();
		System.out.println();
		object.displayAnimal();
		System.out.println();
		object.displayDog();
   }
}