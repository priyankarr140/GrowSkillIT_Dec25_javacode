package day7;
public class Student {
	int age;
	float yearsOfExperience;
	void checkExperience()
	{
		if(yearsOfExperience>=5)
			System.out.println("EXPERIENCED");
		else
			System.out.println("INEXPERIENCED");
	}
	Student(int age1, float years)
	{
		age=age1;
		yearsOfExperience=years;
		System.out.println("CONSTRUCTOR CALLED!");
	}
	Student()
	{
		System.out.println("DEFAULT CONSTRUCTOR CALLED!");
	}
	Student(int age1)
	{
		System.out.println("1 parameter CONSTRUCTOR CALLED!");
	}
}
