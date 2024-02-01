package javaPrajwol;


class Employee{
	
	int id;
	String name;
	public void printdetails() {
		
		System.out.println("my id is "+id);
		System.out.println("and my name is "+name);
	}
}

public class oops_java1 {
public static void main(String[] args) {
	System.out.println("this is our first class");
	
	
	 Employee prajwol=new Employee();
	 Employee john=new Employee();
	 prajwol.id=11;
		prajwol.name="CodeWithPrajwol";
		john.id=12;
		john.name="jhon shrestha";
//	System.out.println( prajwol.id);
//	System.out.println(prajwol.name);
		prajwol.printdetails();
		john.printdetails();
}
}
