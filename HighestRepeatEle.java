import java.util.*;
class HighRepeatEle{
	public static void main(String[] args) {
		String str="hello hi java sql how are you hi hello hello ";
		String [] arr=str.split(" ");
		// String [] arr={"pen","bottle","marker","pen","bottle","duster"};
		boolean [] b=new boolean[arr.length];
		int max=0;
		String ele=null;
		for (int i=0; i<arr.length;i++ ) {
			int cnt=0;
			for (int j=0;j<arr.length ;j++ ) {
				if(arr[i].equals(arr[j]) && b[j]==false){
					cnt++;
					b[j]=true;
				}
			}
			if(cnt!=0){
				if(max<cnt){
					max=cnt;
					ele=arr[i];
				}
			}
		}
			System.out.println("highest frequency element is '"+ele+"' with count "+max);
	}
}