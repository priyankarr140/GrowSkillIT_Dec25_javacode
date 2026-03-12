package day12;

public class Program3_Exception {
	static void checkAge(int age) throws Exception
	{
		if(age<18)
			throw new UnderAgeException("You are underage");
	}
	public static void main(String[] args){
		try {
			int age=16;
			checkAge(age);			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}		
	}

}
