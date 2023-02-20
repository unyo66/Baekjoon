package lv5;

public class T15596 {

	public static void main(String[] args) {
		int[] input = {1, 2, 3, 4};
		System.out.println(sum(input));
	}
	
	public static long sum(int[] a)
	{
		long ret = 0;
		for (int i = 0; i < a.length; i++)
		{
			ret += a[i];
		}
		return ret;
	}
}