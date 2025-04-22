import java.util.*;
class BubbleSort{
	public static void main(String[] args) {
		int [] arr={5,4,9,8,7,3,6,2,1};
		System.out.println(Arrays.toString(arr));
		bubbleSortAsc(arr);
		System.out.println("Ascending : "+Arrays.toString(arr));
		bubbleSortDesc(arr);
		System.out.println("Descending : "+Arrays.toString(arr));
	}
	public  static void bubbleSortAsc(int [] arr){
		for (int i=0;i<arr.length ;i++ ) {
			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public  static void bubbleSortDesc(int [] arr){
		for (int i=0;i<arr.length ;i++ ) {
			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public  static void bubbleSort(String [] arr){
		for (int i=0;i<arr.length ;i++ ) {
			for (int j=i+1;j<arr.length ;j++ ) {
				if ((arr[i].compareTo(arr[j]))>0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}