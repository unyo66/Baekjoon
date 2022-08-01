package lv2;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H= sc.nextInt();
		int M= sc.nextInt();
		
		if (M < 45)
		{
			if (H == 0)
				H = 23;
			else
				H -= 1;
			M += 15;
		}
		else
		{
			M -= 45;
		}
		System.out.print(H + " " + M);
		
		sc.close();
	}

}
