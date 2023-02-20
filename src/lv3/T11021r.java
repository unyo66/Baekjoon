package lv3;

import java.util.Scanner;

public class T11021r {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		rec(input, input + 1);
	}
	public static void rec(int n, int m)
	{
		Scanner sc = new Scanner(System.in);
		if (n == 0)
			return;
		else
		{
			System.out.printf("Case #%d: %d",(m - n), (sc.nextInt() + sc.nextInt()));
			rec(n - 1, m);
		}
	}

}
