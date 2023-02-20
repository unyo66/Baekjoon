package lv3;

import java.util.Scanner;

public class T15552 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++)
		{
			System.out.print(sc.nextInt() + " " + sc.nextInt() + "\n");
		}
		sc.close();
	}

}
