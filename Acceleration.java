import java.util.Scanner; 
class Acceleration{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double v0,v1,t;
		System.out.print("Enter v0,v1 and t : ");
		v0=sc.nextDouble();
		v1=sc.nextDouble();
		t=sc.nextDouble();
		float a=(float)((v1-v0)/t);
		System.out.println("The average acceleration is : "+ a);

		
	}
}
