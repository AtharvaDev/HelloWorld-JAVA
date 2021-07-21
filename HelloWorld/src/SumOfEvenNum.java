import java.util.Scanner;

public class SumOfEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		int add = 0;
		while (n>=i) {
			if (i%2 == 0) {
				add += i;
				i++;
			}else {
				i++;
			}

		}
		System.out.println("Sum is " + add);

	}

}
