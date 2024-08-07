package homes.quality;

import org.testng.annotations.Test;

public class Practice {

	@Test
	public void test()
	{
		int arr[]= {1,5,2,3,6};
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=max)
			{
				max=arr[i];
			}
			else if(arr[i]<=min)
			{
				min=arr[i];
			}
		}
		System.out.println(max+" "+min);
	}
}
