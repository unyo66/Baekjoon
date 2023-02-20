package lv3;

import java.util.Scanner;

public class T11021a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] iarr = new int[T];
		
		for (int i = 0; i < T; i++)
		{
			iarr[i] = sc.nextInt() + sc.nextInt();
		}
		
		for (int i = 1; i <= T; i++)
		{
			if (i != T)
				System.out.println("Case #" + i + ": " + iarr[i - 1]);
			else
				System.out.print("Case #" + i + ": " + iarr[i - 1]);
		}
		sc.close();
		
	}

}
