package lv4;

import java.util.Scanner;

public class T4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		double stu;
		double sum = 0;
		double count = 0;
		double[] iarr = new double[1000];
		
		for (int i = 0; i < C; i++)
		{
			stu = sc.nextDouble();
			for (int j = 0; j < stu; j++)
			{
				iarr[j] = sc.nextDouble();
				sum += iarr[j];
			}
			for (int j = 0; j < stu; j++)
			{
				if (iarr[j] > (sum / stu))
					count++;
			}
			System.out.printf("%.3f", count / stu * 100);
			System.out.println("%");
			sum = 0;
			count = 0;
		}
		sc.close();
	}

}

