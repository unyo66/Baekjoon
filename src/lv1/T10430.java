package lv1;
import java.util.Scanner;

public class T10430
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.print(((a + b) % c) + "\n" +  (((a % c) + (b % c)) % c) + "\n" +  ((a * b) % c) + "\n" +  (((a % c) * (b % c)) % c));
		sc.close();
	}
}