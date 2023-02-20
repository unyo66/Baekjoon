package lv4;

import java.util.Scanner;

public class T2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = a * b * c;
		int ruler = 1000000000;
		int[] iarr = new int[10];
		
		while (x / ruler == 0)
			ruler /= 10;
		ruler *= 10;
		
		
		while (ruler != 1)
		{
			iarr[x % ruler / (ruler / 10)]++;
			ruler /= 10;
		}
		
		for (int e : iarr)
		{
			System.out.println(e);
		}
		
		sc.close();
	}

}
