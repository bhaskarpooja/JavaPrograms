import java.util.*;
class SelectionSort{
	public static void main(String[] args) {
		int [] a={1,5,7,8,6,3,4,9,12};
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length ;i++ ) {
			int indx=i;
			for (int j=i+1;j<a.length ;j++ ) {
				if (a[indx]>a[j]) {
					indx=j;
				}
			}
	                int temp=a[i];
			a[i]=a[indx];
			a[indx]=temp;
		}
		System.out.println(Arrays.toString(a));

	}
	
}
