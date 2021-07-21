import java.util.Scanner;

public class SimpleIntCalc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int p = s.nextInt();
		int r = s.nextInt();
		int t = s.nextInt();
		
		
		double si = (p * r * t)/100;
		
		System.out.println(si);

	}

}
