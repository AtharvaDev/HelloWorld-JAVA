import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		System.out.println(str);
		
		char c = str.charAt(0);
		System.out.println(c);

		System.out.println("Starting with integers");
		int i = s.nextInt();
		System.out.println(i);
		long l = s.nextLong();
		System.out.println(l);

		System.out.println("Starting with decimal no.");
		double d = s.nextDouble();
		System.out.println(d);
		float f = s.nextFloat();
		System.out.println(f);


	}

}
