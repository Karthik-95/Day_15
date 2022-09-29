package Interview;

import java.util.Scanner;

public class Nth_primeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check prime");
		int n=sc.nextInt();
		//int n = 85;
		int count = 0;
		int num = 0;
		int i;
		while (count < n) {
			num++;
			for (i = 2; i <= num; i++) {
				if (num % i == 0) {
					break;
				}
			}
			if (i == num) {
				count++;
			}
		}
		System.out.println("The " + n + "th prime number is: " + num);
	}
}
