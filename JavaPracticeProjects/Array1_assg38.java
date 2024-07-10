package JavaPracticeProjects;

public class Array1_assg38 {

	public static void main(String[] args) 
	{
		Array1_assg38 obj = new Array1_assg38();
       int a[] = {1,2,3,4,5};
       int b[] = {1,2,3,4};
       
       System.out.println("Arrays Are equals or not- > "+obj.isEquals(a, b));
		
		
	}
	
	public boolean isEquals(int a[],int b[]) 
	{
		boolean flag=true;
		if(a.length!=b.length)
			return false;
		else 
		{
			for(int i=0,j=0;i<a.length && j<b.length ;i++,j++) 
			{
				if(a[i] == b[j])
					continue;
				else
					return false;
			}
		}
		return flag;
	}

}
