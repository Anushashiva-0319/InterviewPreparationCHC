import java.util.Scanner;

public class TejDeep {
public static void main(String[] args) {
	
	
	Scanner sc =new Scanner(System.in);
	System.out.println("enter water");
    Long water =sc.nextLong();

    double price =2;
    double total=price*water;
    System.out.println("total price for + : + water : " +total);
}
}

