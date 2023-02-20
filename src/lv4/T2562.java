package lv4;

import java.util.Scanner;

public class T2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iarr = new int[9];
		for (int i = 0; i < 9; i++)
		{
			iarr[i] = sc.nextInt();
		}
		int max = iarr[0];
		int ret = 1;
		for (int i = 0; i < 9; i++)
		{
			if (max < iarr[i])
			{
				max = iarr[i];
				ret = i + 1;
			}
		}
		System.out.print(max + " " + ret);
		sc.close();
	}
}
