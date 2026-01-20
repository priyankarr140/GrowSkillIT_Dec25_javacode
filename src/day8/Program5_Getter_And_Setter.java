package day8;
class Employee
{
	
	int empId;
	String empName;
	float empSalary;	
	Employee(int empId,String empName,float empSalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	int getEmpId()
	{
		return this.empId;
	}
	void setEmpId(int empId)
	{
		this.empId=empId;
	}
}
public class Program5_Getter_And_Setter {
	public static void main(String[] args) {
		Employee emp=new Employee(101,"Rahul",98.5F);
		emp.setEmpId(102);
		System.out.println(emp.getEmpId());
		

	}

}
