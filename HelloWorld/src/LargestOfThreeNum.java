import java.util.Scanner;

public class LargestOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if (a >= b && a >= c) {
			System.out.println("A is largest");
		} else if((b >= a && b >= c)){
			System.out.println("B is largest");
		} else {
			System.out.println("C is largest");
		}



	}

}
