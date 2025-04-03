package binarySearch;

//Explanation: The ceiling function of a real number is the least integer number greater than or equal to the given number.
//In the case of 4.5, the integers greater than 4.5 are 5, 6, 7, 8, ….. The smallest of all is 5.
//ceiling means smallest num in array is greaterthan or equal to target
//{2,3,4,6,7,8,9,12,13,15} here target=12 but we have to find ceil num means greaterThan or equal to target and smallest num 
public class CeilingOfaNumber {

	
	public static void main(String[] args) {
		
		
		int[] arr= {2,3,4,6,12,13,15};
		int target=10;
		int z=ceiling(arr,target);
			System.out.println(z);
		}
	
	static int ceiling(int[] arr,int target) {
		int start=arr[0];
		int end=arr.length-1;
		while(start<=end) {
			//find mid element
		// int mid=(start+end)/2 if we reach the int length +127 so that case it will not work.
			int mid= start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
				//System.out.println(arr[mid]);
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
			return start;
	}
	}
	

