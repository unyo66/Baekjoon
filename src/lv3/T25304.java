package lv3;

import java.util.Scanner;

public class T25304 {

	public static void main(String[] args) {
		int total = 0;
		int kind = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		total = sc.nextInt();
		kind = sc.nextInt();
		
		int[] value = new int[kind];
		int[] quantity = new int[kind]; //초기 수량 1개
		
		for (int i = 0; i < kind; i++)
		{
			value[i] = sc.nextInt();
			quantity[i] = sc.nextInt();
		}
		
		for (int i = 0; i < kind; i++)
		{
			sum += value[i] * quantity[i];
		}
		
		if (sum == total)
			System.out.print("Yes");
		else
			System.out.print("No");
		sc.close();
		
	}

}
