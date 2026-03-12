package day14;
import java.io.*;
public class Program1_ReadFile {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\Priyanka Arora\\Desktop\\testFile.txt");
		try(FileReader fr=new FileReader(file)) {
			
			int ch;
			while((ch=fr.read())!=-1)
			{
				System.out.print((char)ch);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		/*BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}*/

	}

}
