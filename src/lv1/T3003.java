package lv1;

import java.util.Scanner;

public class T3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iarr = new int[6];
		for (int i = 0; i < 6; i++)
		{
			iarr[i] = sc.nextInt();
		}
		
		iarr[0] = -1 * iarr[0] + 1;
		iarr[1] = -1 * iarr[1] + 1;
		iarr[2] = -1 * iarr[2] + 2;
		iarr[3] = -1 * iarr[3] + 2;
		iarr[4] = -1 * iarr[4] + 2;
		iarr[5] = -1 * iarr[5] + 8;
		
		for (int i = 0; i < 6; i++)
		{
			System.out.print(iarr[i]);
			if (i != 5)
				System.out.print(" ");
		}
		sc.close();
	}

}
