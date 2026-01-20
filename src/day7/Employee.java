package day7;

public class Employee {
	String empName;
	int empId;
	float empSalary;
	Employee()
	{
		
	}
	Employee(String empName,int empId,float empSalary)
	{
			this.hello();
			this.empName=empName;
			this.empId=empId;
			this.empSalary=empSalary;		
			
	}
	void display()
	{
		System.out.println(this.empId+":"+empName+":"+empSalary);
	}
	void hello()
	{
		System.out.println("HELLO");
	}
	

}
