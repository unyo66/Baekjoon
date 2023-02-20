package lv4;

import java.util.Scanner;

public class T3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[10];
		int[] remain = new int[42];
		int ret = 0;
		
		for (int i = 0; i < 10; i++)
		{
			input[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 10; i++)
		{
			remain[input[i] % 42]++;
		}
		
		for (int i = 0; i < 42; i++)
		{
			if (remain[i] != 0)
				ret++;
		}
		
		System.out.print(ret);
		sc.close();
	}

}
