package day9;
class Parent {
    Parent() {
        System.out.print("P1 ");
    }
    Parent(int x) {
        System.out.print("P2 ");
    }
}
class Child extends Parent {
    Child() {
        this(5);
        System.out.print("C1 ");
    }
    Child(int x) {
        super(x);
        System.out.print("C2 ");
    }
}

public class Program2_Output {
	public static void main(String[] args) {
        new Child();

	}

}
