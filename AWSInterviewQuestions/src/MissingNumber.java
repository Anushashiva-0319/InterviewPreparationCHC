//Write a program to find a missing number in an integer array?------->2 times *************
//Input Array : [1, 4, 5, 3, 2, 8, 6]   Missing Number is = 7

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 3, 2, 8, 6 };
		
		
		for(int i=0;i<arr.length;i++) {
			int temp =0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
				
				
			}
			System.out.println(arr[i]);
			
			
		}
		
		int n=arr.length+1;
		int totalSum = n *(n+1)/2;
		
		for(int i=0;i<arr.length;i++) {
			totalSum =totalSum-arr[i];
		}
		System.out.println(totalSum + "the missing num is ");
		
		
	}

}
