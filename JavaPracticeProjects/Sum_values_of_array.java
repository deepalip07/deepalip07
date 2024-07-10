package JavaPracticeProjects;

public class Sum_values_of_array 
{
	int a[]= {1,3,4,7,8,9};
	int sum=0;
	void add()
	{
	
	for(int i=0;i<=5;i++)	
	{
	     sum=sum+a[i];
		
	}
	System.out.println(sum);

	}
	
	public static void main(String[] args) 
	{
		
		Sum_values_of_array s=new Sum_values_of_array();
		
		s.add();
	}

	
	}


