package lv3;

import java.util.Scanner;

public class T8393r {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print(rec(sc.nextInt()));
		sc.close();
	}
	public static int rec(int n)
	{
		if (n == 0)
			return 0;
		else
		{
			return n + rec(n - 1);
		}
	}

}
