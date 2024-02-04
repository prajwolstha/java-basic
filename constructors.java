package javaPrajwol;


class myMainEmployee{
	private int id;
	private String name;
	
	
	public myMainEmployee(){
	id=17;
	name="CodeWithPrajwol";

	}
	
	public myMainEmployee(int a,String b){
		id=a;
		name=b;

		}
	public myMainEmployee(String b){
		id=0;
		name=b;

		}
	
	
	
	
    public void setId(int n) {
		id=n;
	}

	public int getId() {
      return id;		
		
	}
	
	public void setName(String no) {
		name=no;
	}

	public String getName() {
      return name;		
		
      
	}

}


public class constructors {
public static void main(String[] args) {
	
	
	//constructor overloading
	
	
//	myMainEmployee prajwol=new myMainEmployee();
//	System.out.println(prajwol.getId());
//	System.out.println(prajwol.getName());
	
	
	myMainEmployee prajwol=new myMainEmployee(455,"programmer");
	System.out.println(prajwol.getId());
	System.out.println(prajwol.getName());
	
	
//	myMainEmployee prajwol=new myMainEmployee("programmer");
//	System.out.println(prajwol.getId());
//	System.out.println(prajwol.getName());
	
	
	
	
	
}
}
