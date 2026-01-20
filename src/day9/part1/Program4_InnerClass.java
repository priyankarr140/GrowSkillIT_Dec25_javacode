package day9.part1;

import javax.naming.spi.ObjectFactoryBuilder;

class User
{
	int userId;
	public User(int userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	String userName;
	static String companyName;
	 class Address
	{
		 String city;
		  String state;
	      String country;
		public Address(String city, String state, String country) {
			this.city = city;
			this.state = state;
			this.country = country;
		}		
		static void hello()
		{
			System.out.println(city);
		}
	}
}
public class Program4_InnerClass {
	public static void main(String[] args) {
		User user=new User(101,"Rajat");
		user.userId=101;
		//User.Address home=user.new Address("pune","MH","India");
	    User.Address office=user.new Address("mumbai","MH","India");
		User.Address address1=new User.Address(null, null, null);
		address1.city="Pune";
		User.companyName="GSIDEC25";
		User.Address.city="Pune";
		System.out.println(obj.city);
		//User.Address.city="PUNE";
		

	}

}
