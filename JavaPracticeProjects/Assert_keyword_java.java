package JavaPracticeProjects;

public class Assert_keyword_java 
{

	public static void main(String[] args) 
	{
		int a = 12;
	    try 
	    {
	      assert a == 12; // Assertion without a fail message
	      //assert a == 12 : "a is not 12";
	      assert a == 15 : "a is not 15";
	    } catch (AssertionError e) 
	    {
	      System.out.println(e);
	    }

	}

	}
