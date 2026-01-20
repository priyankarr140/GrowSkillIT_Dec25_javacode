package day9;

import day9.part2.UserTest;

class Parents {
     static void show() {
        System.out.println("Parent show");
    }
}
class Childs extends Parents {
   static  void show() {
        System.out.println("Child show");
    }
}
public class Program_Access {
	public static void main(String[] args) {
		 Parents p = new Childs();
	        p.show();
	        System.out.println(UserTest.num);

	}

}
