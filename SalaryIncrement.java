import java.util.Scanner;
class SalaryIncrement{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your salary : ");
		double sal=sc.nextDouble();
		System.out.println("Enter your score : ");
		int score=sc.nextInt();
		if(score>0 && score<100){
	           if(score>=90){
	           	System.out.println("previous salary : "+sal);
	           	sal+=(sal*0.03);
	           	System.out.println("Incremented salary by 3% is : "+sal+" rs.");
	           }
	           else{
	            System.out.println("previous salary : "+sal);
	           	sal+=(sal*0.01);
	           	System.out.println("Incremented salary by 1% is : "+sal+" rs.");
	           }
		}
		else{
			System.out.println("Please enter valid score");
		}
	}
}
