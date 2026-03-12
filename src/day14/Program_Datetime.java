package day14;
import java.time.LocalDateTime;
import java.time.format.*;
public class Program_Datetime {
	public static void main(String[] args) {
		 DateTimeFormatter formatter =
		            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		 LocalDateTime today=LocalDateTime.parse("12-02-2026 16:30:00", formatter);
		 System.out.println(today);

	}

}
