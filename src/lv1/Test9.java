package lv1;
import java.util.Scanner;

public class Test9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print((a + b) + "\n" + (a - b) + "\n" + (a * b) + "\n" + (a / b) + "\n" + (a % b));
		sc.close();
	}
}