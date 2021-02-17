package Inputoutputoperation;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		int sum = 0;
		for(int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum = a + b;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}
