package lv4;

import java.util.Scanner;

public class T10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] iarr = new int[N];
		
		for (int i = 0; i < N; i++)
		{
			iarr[i] = sc.nextInt();
		}
		int max = iarr[0];
		int min = iarr[0];
		
		for (int i = 0; i < N; i++)
		{
			if (max < iarr[i])
				max = iarr[i];
			if (min > iarr[i])
				min = iarr[i];
		}
		System.out.print(min + " " + max);
		
		sc.close();
	}
}
