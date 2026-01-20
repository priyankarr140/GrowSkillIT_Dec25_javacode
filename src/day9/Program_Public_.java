package day9;
class Parent_ {
     protected void display() {
        System.out.println("Parent display");
    }
}
class Child_ extends Parent_ {
	//int num=10;
     public void display() {
    	//super.display();
        System.out.println("Child display");
    }
}
public class Program_Public_ {
	public static void main(String[] args) {
		 Parent_ p = new Child_();
	        p.display();

	}

}
