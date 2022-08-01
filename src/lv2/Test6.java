package lv2;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if ((B + C) >= 60)
		{
			if (A + ((B + C) / 60) > 23)
			{
				A += ((B + C) / 60) - 24;
			}
			else
				A += ((B + C) / 60);
			while (B + C >= 60)
			{
				B -= 60;
			}
		}
		B += C;
		System.out.print(A + " " + B);
		sc.close();
	}

}
