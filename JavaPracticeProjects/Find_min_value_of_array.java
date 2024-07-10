package JavaPracticeProjects;

public class Find_min_value_of_array 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,5,6};
		int min=a[0];
		for(int i=1;i<4;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum number is:"+min);

	}

}
