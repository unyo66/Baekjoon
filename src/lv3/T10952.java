package lv3;

import java.util.Scanner;

public class T10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iarr = new int[2];
		
		do
		{
			iarr[0] = sc.nextInt();
			iarr[1] = sc.nextInt();
			if (iarr[0] != 0 && iarr[1] != 0)
				System.out.println(iarr[0] + iarr[1]);
		}
		while (iarr[0] != 0 || iarr[1] != 0);
		sc.close();
	}
}