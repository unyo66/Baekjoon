package lv5;
import java.util.Scanner;

public class T1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.print(count(N));
		sc.close();
	}
	public static int count(int n)
	{
		int ret = 0;
		int a, b, c;
		if (n <= 99)
		{
			ret = n;
		}
		else if (n <= 110)
		{
			ret = 99;
		}
		else
		{
			ret = 99;
			for (int i = 111; i <= n; i++)
			{
				a = i / 100;
				b = i % 100 / 10;
				c = i % 10;
				if ((a - b) == (b - c))
					ret++;
			}
		}
		return ret;
	}
}
