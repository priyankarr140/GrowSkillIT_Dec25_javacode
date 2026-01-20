package day9;
class Base {
	
    Base(int x) {
        System.out.print("Base ");
    }
}

class Derived extends Base {
    Derived() {
        System.out.print("Derived ");
    }
}


public class Program4_Output {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Derived();


	}

}
