
public class Array {
public static void main(String[] args) {
	int arr[]= {1,44,55,108,6,7};
	int min = arr[0];
	int max=arr[0];
	int second=arr[0];
	int third=arr[0];
	for(int i=0; i<arr.length; i++) {
		if(arr[i] > max) {
			second=max;
			max = arr[i];
		}
		else if(arr[i]>second) {
			third=second;
			second =arr[i];
		}
		else if(arr[i]>third) {
			
			third=arr[i];
			
		}
		else if(arr[i]<min) {
			min = arr[i];
		}
	     
	}
	System.out.println("The max element is" + max);
	System.out.println("The second MAXIMUM element is" + second);
	System.out.println("The Third MAXIMUM element is" + third);
	System.out.println("The min element is" + min);	
}
}

