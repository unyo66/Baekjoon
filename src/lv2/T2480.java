package lv2;

import java.util.Scanner;

public class T2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A == B && B == C)
		      System.out.printf("%d", 10000 + A * 1000);
		    else if (A == B)
		    	System.out.printf("%d", 1000 + A * 100);
		    else if (B == C)
		    	System.out.printf("%d", 1000 + B * 100);
		    else if (C == A)
		    	System.out.printf("%d", 1000 + C * 100);
		    else
		    {
		      if (A > B && A > C)
		    	  System.out.printf("%d", A * 100);
		      else if (B > A && B > C)
		    	  System.out.printf("%d", B * 100);
		      else if (C > A && C > B)
		    	  System.out.printf("%d", C * 100);
		    }
		sc.close();
	}

}
