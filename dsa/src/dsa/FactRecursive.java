package dsa;

import java.util.Scanner;

public class FactRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		System.out.println(fact(input));
	}
	public static int fact(int n) {
		if(n<=1)
			return n;
		else
			return fact(n-1) * n;
	}

}
