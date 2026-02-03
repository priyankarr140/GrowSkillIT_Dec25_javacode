package day11;import java.util.*;
class Test
{
	int id;
	String name;
	public Test(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		return id == other.id ;
	}	
}
public class Program6_Set2 {
	public static void main(String[] args) {
		Set<Test>setA=new HashSet<Test>();
		setA.add(new Test(1,"Maths"));
		setA.add(new Test(1,"English"));
		setA.add(new Test(2,"English"));
		for(Test data:setA)
			System.out.println(data.id+":"+data.name);
	}
}
