import java.util.Scanner;

import studyEasy.Prime;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int i = 2;
//		while(i <= n-1) {
//			if (n%i == 0) {
//				System.out.println("Not Prime");
//				return;
//			} else {
//				i += 1;
//			}
//		}
//		System.out.println("Prime");
		
		Prime a = new Prime();
		
		System.out.println(a.isPrime(20));


	}

}
