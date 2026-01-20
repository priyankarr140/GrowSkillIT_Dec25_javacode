package day9;
class X {
    X() {
        System.out.print("X ");
    }
}

class Y extends X {
    Y() {
        System.out.print("Y ");
        super();
    }
}

public class Program3_Output {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Y();


	}

}
