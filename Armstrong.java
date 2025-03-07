import java.util.Scanner;
class Armstrong{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check if Armstrong or not :");
		int num=sc.nextInt();
		int sum=0;
		int dup=num;
		int count=0;
		for (int i=num;i>0;i/=10) {
			count++;
		}

		while(num>0){
			int rem =num%10;
			int pow =1;
			for (int i=0;i<count;i++) {
				pow*=rem;
			}
			sum+=pow;
			num/=10;
		}
		System.out.println((sum==dup)?dup+" is Armstrong":dup+" is not Armstrong");
	}
}