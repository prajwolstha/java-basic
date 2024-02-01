package javaPrajwol;
class Help{
	int salary;
	String name;
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
}

public class oop_practise_set {

	
	
	public static void main(String[] args) {
		
		
		Help prajwol= new Help();
		prajwol.setName("codeWithPrajwol");
		prajwol.salary=55000;
		System.out.println(prajwol.getName());
		
		System.out.println(prajwol.getSalary());
		
	}
}
