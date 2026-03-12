package day14;

import java.io.*;

class User implements Serializable
{
	String usernam;
	transient String password;
	public User(String usernam, String password) {
		super();
		this.usernam = usernam;
		this.password = password;
	}
}
public class Program_Serialization {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		User user=new User("Rahul","pass@123");
		File file=new File("C:\\Users\\Priyanka Arora\\Desktop\\testFile.txt");

		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(user);
		

	}

}
