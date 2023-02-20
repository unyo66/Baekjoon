package lv3;

import java.util.Scanner;

public class T11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int A, B;
		
		for (int i = 1; i <= input; i++)
		{
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d", i, A, B, A + B);
			
		}
	}

}
