package javaPrajwol;


	class details{
		private int id,salary;
		private String name;
		
		
		public details(int x ,String y,int z){
		id=x;
		name=y;
        salary=z;
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
	    public void setSalary(int s) {
				salary=s;
			}

			public int getSalary() {
		      return salary;		
				
			}
		
		

	}


	public class constructor_quiz {
	public static void main(String[] args) {
		
		
		//constructor overloading
		
		
//		myMainEmployee prajwol=new myMainEmployee();
//		System.out.println(prajwol.getId());
//		System.out.println(prajwol.getName());
		
		
		details prajwol=new details(17,"programmerPrajwol",10000);
		System.out.println(prajwol.getId());
		System.out.println(prajwol.getName());
		System.out.println(prajwol.getSalary());
		
		
//		myMainEmployee prajwol=new myMainEmployee("programmer");
//		System.out.println(prajwol.getId());
//		System.out.println(prajwol.getName());
		
		
		
		
		
	}
	}

