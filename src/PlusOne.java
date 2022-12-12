
public class PlusOne {
public static void main(String[] args) {
	int arr[]= {9};
	
	int[] plusOne = plusOne(arr);
	for(int i:plusOne) {
		System.out.print(i);
	}
}

private static int[] plusOne(int[] arr) {
	// TODO Auto-generated method stub
	for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]<9) {
				arr[i]++;
				return arr;
			}else {
				arr[i]=0;
			}
	}
	int[] newArray=new int[arr.length+1];
	newArray[0]=1;
	return newArray;
}
}
