package day11;
import java.util.*;
class Employee implements Comparable<Employee>
{
	int empId;
	String empName;
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}	
	public int compareTo(Employee obj)
	{
		return obj.empId-this.empId;
	}
}
class EmployeeComparator implements Comparator<Employee>
{
	public int compare(Employee obj1,Employee obj2)
	{
		//return obj1.empName.compareTo(obj2.empName);
		//return obj1.empId-obj2.empId;
		return obj2.empId-obj1.empId;
	}
}
public class Program4_Comparator {
	public static void main(String[] args) {
		List<Employee>list=new ArrayList<Employee>();
		list.add(new Employee(2,"Rajat"));
		list.add(new Employee(1,"Astha"));
		list.add(new Employee(3,"Zainab"));
		Collections.sort(list,new EmployeeComparator());		
		for(Employee e:list)
		{
			System.out.println(e.empId+":"+e.empName);
		}



	}

}
