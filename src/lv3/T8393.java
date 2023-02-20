package lv3;

import java.util.Scanner;

public class T8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++)
		{
			sum += i;
		}
		System.out.print(sum);
		sc.close();
	}

}
