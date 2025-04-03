//Write a program to find second largest element in an array of integers?
//Input Array :[47498, 14526, 74562, 42681, 75283, 45796]
public class ArraySecondNum {

	public static void main(String[] args) {
		
		int[] a = {47498, 14526, 74562, 142681, 75283, 45796};
		int max=a[0];
		int secondMax =a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secondMax=max;
				max=a[i];
			}
			else {
				if(a[i]>secondMax) {
					secondMax=a[i];
				}
			}
			
		}
		System.out.println("the first largest element"  +max);
		System.out.println("the second largest element"  +secondMax);
		
	}

}
