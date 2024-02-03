package javaPrajwol;
class myEmployee{
	
	
	 private int id;
    private String name;
    
    public String getName() {
    	return name;
    }
    public void setName(String n) {
        	name=n;
    }
    
    public int getId() {
    	return id;
    }
    public void setId(int i) {
    	 id=i;
    }
    
}
public class Access_modifier {
public static void main(String[] args) {
	
	
	myEmployee prajwol= new myEmployee();
//	prajwol.id=45;
//	prajwol.name="prajwol";  throws an error due to private access modifier
	
	prajwol.setName("codeWithPrajwol");
	System.out.println(prajwol.getName());
	
	prajwol.setId(45);
	System.out.println(prajwol.getId());
}
}

