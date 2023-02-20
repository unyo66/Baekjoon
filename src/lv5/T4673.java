package lv5;

import java.util.Arrays;

public class T4673 {

	public static void main(String[] args) {
		int input = 100;
		int[] iarr = new int[input];
		int D;
		Arrays.fill(iarr, 1);
		
		for (int i = 1; i <= input; i++)
		{
			D = nextD(i);
			if (D <= input)
			{
				iarr[D - 1] = 0;
			}
		}
		
		for (int i = 0; i < input; i++)
		{
			if (iarr[i] != 0)
				System.out.println(i + 1);
		}
	}
	
	public static int nextD(int n)
	{
		int ret = n;
		while (n != 0)
		{
			ret += n % 10;			
			n /= 10;
		}
		return ret;
	}

}
