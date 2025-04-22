import java.util.Scanner;
class Bmi{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight in pounds : ");
		float weight=(float)(sc.nextFloat()*0.45359237);
		System.out.println("Enter height in inches : ");
		float height=(float)(sc.nextFloat()*0.0254);
		float bmi = weight/(height*height);
		System.out.println("BMI is "+bmi);
	}
}