
public class BreakContinue
{
	public static void windowPosSum(int[] a, int n)
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++)
		{
			if ( a[i] >= 0)
			{
				for ( int j = i;  j < i + n + 1 && j <  a.length; j++)
				{
					sum += a[j];
				}
				a[i] = sum;
				sum = 0;
			}
		}
	}
	
	public static void main(String[] args)
	{		
		int[] a = {1, 2, -3, 4, 5, 4};
		int n = 3;
		windowPosSum(a, n);
		System.out.println(java.util.Arrays.toString(a));
	}
}
