package lv3;

import java.util.Scanner;

public class T2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			if (i != n)
				System.out.println();
		}
		sc.close();
	}

}
