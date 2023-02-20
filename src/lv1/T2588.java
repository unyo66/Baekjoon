package lv1;
import java.util.Scanner;

public class T2588
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print((a * (b % 10)) + "\n" + (a * (b % 100 / 10)) + "\n" + (a * (b / 100)) + "\n" + (a * b));
		sc.close();
	}
}