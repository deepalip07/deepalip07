package Encapsulation;

class Employee
{
	
	private int emp_id;
	private int emp_salary;
	private String emp_name;
	
	
	public int getEmpid()
	{
		return emp_id;
	}
	
	public void setEmpid(int emp_id)
	{
		this.emp_id=emp_id;
	}
	
	public int getEmpsalary()
	{
		return emp_salary;
	}
	
	public void setEmpsalary(int emp_salary)
	{
		this.emp_salary=emp_salary;
	}
	
	public String getEmpname()
	{
		return emp_name;
	}
	
	public void setEmpname(String emp_name)
	{
		this.emp_name=emp_name;
	}
}

public class Encapsulation_02 
{

	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		
		emp.setEmpid(12);
	    emp.setEmpname("Mahesh");
		emp.setEmpsalary(89000);
		
		int emp_id=emp.getEmpid();
		String emp_name=emp.getEmpname();
		int emp_salary=emp.getEmpsalary();
		
		System.out.println("Employee id--->"+emp_id);
		System.out.println("Employee Name--->"+emp_name);

		System.out.println("Employee Salary--->"+emp_salary);


	}

}
