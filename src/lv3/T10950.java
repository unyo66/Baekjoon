package lv3;

import java.util.Scanner;

public class T10950 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] arr = new int[T][2];
		
		for (int i = 0; i < T; i++)
		{
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		for (int i = 0; i < T; i++)
		{
			System.out.print(arr[i][0] + arr[i][1] + "\n");
		}
		sc.close();
	}
}
