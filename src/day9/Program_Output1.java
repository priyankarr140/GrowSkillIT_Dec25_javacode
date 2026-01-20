package day9;
class A {
    A() {
        System.out.print("A1 ");
    }
    A(int x) {
        System.out.print("A2 ");
    }
}
class B extends A {
    B() {
        System.out.print("B1 ");
    }
    B(int x) {
        System.out.print("B2 ");
    }
}

public class Program_Output1 {
	public static void main(String[] args) {
        B obj = new B(10);


	}

}
