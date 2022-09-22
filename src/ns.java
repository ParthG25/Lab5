import java.util.*;

public class ns 
{
	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);

		int n = ss.nextInt(), arr[] = new int[n];
		
		for(int i = 0;i < n;i++)
			arr[i] = ss.nextInt();
		
		for (int i = 1; i < n; ++i) 
		{
            int key = arr[i];
            int j = i - 1;
  
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

		
		for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + "\t");
  
        System.out.println();
		
		ss.close();
	}
}