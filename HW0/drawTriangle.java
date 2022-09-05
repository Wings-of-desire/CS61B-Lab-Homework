
public class drawTriangle
{
	public static void main(String[] args)
	{
		int N = Integer.parseInt(args[0]);
		for (int col = 1; col < N; col++)
		{
			for (int i = 0; i < col; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}	
