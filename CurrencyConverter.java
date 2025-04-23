import java.util.Scanner;
class CurrencyConverter{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("**********CURRENCY CONVERTER************");
	    System.out.println("KNOW YOUR CURRENCY RATE");
	    System.out.println();
	    System.out.println("CURRENCY : 1.USD 2.EUR 3.KWD 4.GBP 5.KRW 6.JPY 7.RUBLE 8.BRL 9.AED");
	    System.out.print("Enter the amount in INR : ");
	    float inr=sc.nextFloat();
	    System.out.print("Enter your currency : ");
      String curr=sc.next().toUpperCase();

      switch(curr){
        case "USD":{
        	float usd=inr/83.8152f;
      	  System.out.println("INR : "+inr+"INR = USD : "+usd+"USD");
          break;
      }
        case "EUR":{
      	  float eur=inr/93.4985f;
      	  System.out.println("INR : "+inr+"INR = EUR : "+eur+"EUR");
          break;
      }
        case "KWD":{
      	  float kwd=inr/274.265f;
      	  System.out.println("INR : "+inr+"INR = KWD : "+kwd+"KWD");
          break;
      }
        case "GBP":{
      	  float gbp=inr/110.710f;
      	  System.out.println("INR : "+inr+"INR = GBP : "+gbp+"GBP");
          break;
      }
        case "KRW":{
      	  float krw=inr/0.0632897f;
      	  System.out.println("INR : "+inr+"INR = KRW : "+krw+"KRW");
          break;
      }
        case "JPY":{
      	  float jpy=inr/0.580458f;
      	  System.out.println("INR : "+inr+"INR = JPY : "+jpy+"JPY");
          break;
      }
        case "RUBLE":{
      	  float ruble=inr/0.915901f;
      	  System.out.println("INR : "+inr+"INR = RUBLE : "+ruble+"RUBLE");
          break;
      }
        case "BRL":{
      	  float brl=inr/15.2886f;
      	  System.out.println("INR : "+inr+"INR = BRL : "+brl+"BRL");
          break;
      }
        case "AED":{
      	  float aed=inr/22.8224f;
      	  System.out.println("INR : "+inr+"INR = AED : "+aed+"AED");
          break;
      }
        default: System.out.println("WRONG CURRENCY ENTERED"); 
    }
}
}