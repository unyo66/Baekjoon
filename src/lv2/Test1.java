package lv2;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A= sc.nextInt();
		int B= sc.nextInt();
		
		if (A > B)
			System.out.print(">");
		else if (A < B)
		{
			System.out.print("<");
		}
		else
			System.out.print("==");
		
		sc.close();
	}

}
