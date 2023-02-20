package lv3;

import java.util.Scanner;

public class T1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ret = n;
		int cnt = 0;
		do
		{
			if (ret / 10 + ret % 10 < 10)
			{
				ret = ret % 10 * 10 + ret / 10 + ret % 10;
			}
			else
			{
				ret = ret % 10 * 10 + (ret / 10 + ret % 10) % 10;
			}
			cnt++;
		}
		while (ret != n);
		System.out.print(cnt);
		sc.close();
	}

}
