
public class Exercise1a
{
	public static void main(String[] args)
	{
		int SIZE  = 5;
		for (int col = 1; col <= SIZE; col++)
		{
			for (int i = 0; i < col; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
