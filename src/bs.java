import java.util.*;

public class bs 
{
	public static void main(String args[])
	{
		Scanner ss = new Scanner(System.in);
		
		int n = ss.nextInt(), arr[] = new int[n];
		
		for(int i = 0;i < n;i++)
			arr[i] = ss.nextInt();
		
		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < n - i - 1;j++)
			{
				if(arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		for(int i = 0;i < n;i++)
			System.out.print(arr[i] + "\t");
		System.out.println();
		
		ss.close();
	}
}
