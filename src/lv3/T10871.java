package lv3;

import java.util.Scanner;

public class T10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] iarr = new int[n];
		
		for (int i = 0; i < n; i++)
		{
			iarr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++)
		{
			if (iarr[i] < x)
				System.out.print(iarr[i]+ " ");
		}
		sc.close();
	}

}
