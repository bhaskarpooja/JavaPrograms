import java.util.*;
class MergeArray{
   public static void main(String[] args) {
   		int []a={10,20,30,40};
   		int []b={50,60,70,80,90,100};
   		int []c=new int [a.length+b.length];
   		for (int i=0;i<c.length ;i++ ) {
   			if(i<a.length)
   				c[i]=a[i];
   			else
   				c[i]=b[i-(a.length)];
   		}
   		System.out.println(Arrays.toString(c));
   	}	
}