package lv3;

import java.util.Scanner;

public class T11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++)
		{
			if (i != T) 
				System.out.printf("Case #%d: %d\n", i, sc.nextInt() + sc.nextInt());
			else
				System.out.printf("Case #%d: %d", i, sc.nextInt() + sc.nextInt());

		}
		sc.close();
	}

}
