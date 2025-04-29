import java.util.Scanner;
class CountOfDigit
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
	    for (int i=num;i>0;i/=10) {
	    	count++;
	    }
	    System.out.println("count of digits is : "+count);
	}
}