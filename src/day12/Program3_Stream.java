package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class Student
{
	int rollNo;
	String name;
	String dept;
	int marks;
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int rollNo, String name, String dept, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks 
				;
	}
}
public class Program3_Stream {
	public static void main(String[] args) {
		Student s1=new Student(1,"Zainab","ECE",60);
		Student s2=new Student(2,"Yatin","ECE",80);
		Student s3=new Student(3,"Astha","CSE",90);
		Student s4=new Student(4,"Bhawna","CSE",70);
		List<Student>list=new ArrayList<Student>();
		list.add(s1);list.add(s2);list.add(s3);list.add(s4);
		
		//FILTER ON THE BASIS OF NAME STARTS 'R' or 'S'
		System.out.println("FILTER NAME STARTS WITH R OR S");

		List<Student>filterList=
				
		list
		.stream()
		.filter(s->(s.name.startsWith("R")||s.name.startsWith("S"))
				&&s.marks>70)
		//.toList();
		.collect(Collectors.toList());
		
		filterList.add(new Student(5,"Palak","MECH",50));
		//.collect(Collectors.toList());
		
		for(Student data:filterList)
			System.out.print(data.name+":"+data.rollNo+" ");
		
		System.out.println("\nFOR EACH PRACTICE***");
		list
		.stream()
		.forEach(s->System.out.println(s.rollNo+":"+s.name));
		
		
		
		
		//FOR EACH
		System.out.println();
		filterList.stream().forEach
		(s->System.out.println(s.rollNo+":"+s.name));
		
		
		
		System.out.println("SORT ON MARKS***");
		
		//SORT ON MARKS
		
		list
		.stream()
		.sorted(Comparator.comparingInt(Student::getMarks).reversed())
		.forEach(s->System.out.println(s.name+":"+s.marks));
		
		System.out.println("SORT ON Name DESC***");
		
		list
		.stream()
		.sorted(Comparator.comparing(Student::getName).reversed())
		.forEach(s->System.out.println(s.name+":"+s.marks));
		
		
		
		
		
		
		
		
		System.out.println("SORT ON MARKS IN DESCENDING ORDER");
		
		//SORT ON MARKS IN DESCENDING ORDER
		
		list.stream().sorted(Comparator.comparing(Student::getMarks).reversed())
		.forEach(s->System.out.println(s.name));
		System.out.println("SORT ON NAME IN ASCENDING ORDER");
		
		//
		System.out.println("SORT COMPARATOR NAME ASC ^^^");
		list
		.stream()
		.sorted((a,b)->a.getName().compareTo(b.getName()))
		.forEach(s->System.out.println(s.name));
		
		System.out.println("SORT COMPARATOR NAME DESC ^^^");
		list
		.stream()
		.sorted((a,b)->b.getName().compareTo(a.getName()))
		.forEach(s->System.out.println(s.name));
		
		System.out.println("SORT COMPARATOR MARKS ASC ^^^");
		list
		.stream()
		.sorted((a,b)->a.marks-b.marks)
		.forEach(s->System.out.println(s.marks));
		
		System.out.println("SORT COMPARATOR MARKS DESC ^^^");
		list
		.stream()
		.sorted((a,b)->b.marks-a.marks)
		.forEach(s->System.out.println(s.marks));
		
		
		
		
		
		System.out.println("MAP INTO DEPT***");
		List<String>dept=list.stream().map(Student::getDept).collect(Collectors.toList());
		dept.forEach(s->System.out.println(s));
		
		System.out.println("MARKS TOTAL**");
		
		int sum=list.stream().map(Student::getMarks).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		System.out.println("MAXIMUM MARKS-1");
		Optional max=list.stream().map(Student::getMarks).reduce(Integer::max);
		System.out.println(max.get());
		
		System.out.println("MAXIMUM MARKS-2");

		OptionalInt max3=list.stream().map(Student::getMarks).
		mapToInt(Integer::intValue).max();
		System.out.println(max3.getAsInt());
		
		System.out.println("MAXIMUM MARKS NAME");
		Optional<Student> max2=list.stream().max
		((a,b)->Integer.compare(a.getMarks(), b.getMarks()));
		max2.ifPresent(s->System.out.println(s.name));
		
		System.out.println("Count students scoring more than 70");
		Long count=list.stream().filter(s->s.marks>=70).count();
		System.out.println(count);
		
		System.out.println("Greater than 70 first");
	    Optional<Student> opt1=list.stream().filter(s->s.marks>70).findFirst();
	    System.out.println(opt1.get().name);
	    
	    Map<String, Optional<Student>>groupList=list.stream().collect(
	    		Collectors.groupingBy(Student::getDept,
	    				Collectors.maxBy((a,b)->a.getMarks()-b.getMarks())));
	    
	    for(Map.Entry<String,Optional<Student>>e:groupList.entrySet())
	    {
	    	System.out.println(e.getKey()+":"+e.getValue().get().marks);
	    }
	    System.out.println("LIMIT**");
	    list.stream().limit(3).forEach(s->System.out.println(s.name));
	    System.out.println("DISTINCT**");
	    list.stream().distinct().forEach(s->System.out.println(s.name));
	    System.out.println("SKIP**");

	    list.stream().skip(1).forEach(s->System.out.println(s.name));
	    
	    System.out.println("FIBONACCI**");
	    //0 1 1 
	    Stream.iterate(new int[] {0,1},arr-> new int[] {arr[1],arr[1]+arr[0]})
	    .limit(10).forEach(s->System.out.print(s[0]+" "));
	    System.out.println("\nBOXED INT STREAM TO STREAM<INTEGER>");
	   
	    List<Integer>list2=IntStream.range(1, 10).boxed().collect(Collectors.toList());
	    list2.forEach(s->System.out.print(s+" ") );
	    
	    System.out.println("Random");
	    Stream<Double>randomList=Stream.generate(Math::random).limit(3);
	    randomList.forEach(s->System.out.print(s+" "));
	    
	    List<String>listStr=Arrays.asList("hello","all","how","are","you");
	    List<String>output= listStr.stream().flatMap(s->Arrays.stream(s.split("")))
		.collect(Collectors.toList());
	   output.forEach(s->System.out.print(s+" "));
	   
	   System.out.println("SORT ON THE BASIS OF LENGTH");
	    List<String>listStr2=Arrays.asList("hellooo","a","them","no","yes");
	    listStr2.stream().sorted(Comparator.comparingInt(String::length)).
	    forEach(s->System.out.println(s));

	    
	    
	    
	    
	    
		
		

	}

}


