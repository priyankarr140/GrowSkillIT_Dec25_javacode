package day7;

import day8.TestAccess;
public class Program1_Object extends TestAccess{
	public static void main(String[] args) {		
		  Student s1=new Student(30,7); 
		  Student s2=new Student(30); Student s3=new
		  Student();
		  //ctrl+shift+/	    
	    Employee e1=new Employee("Rahul",101,100.0F);
	    Employee e2=new Employee();
	    e2.empId=102;
	    e2.empName="Rohan";
	    e2.empSalary=200.0F;
	    e1.display();
	    e2.display();
	    Program1_Object obj=new Program1_Object();
		obj.protectedNum=20;


		

	}

}
