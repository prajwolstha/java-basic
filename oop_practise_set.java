package javaPrajwol;

//Q no 1
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

//Q no 2
 class cellPhone{
	 public void ring(){
		 System.out.println("ringing...");
		 
	 }
	 public void vibrate() {
		 System.out.println("vibrating");
		 
	 }
	 public void callFriend() {
		 System.out.println("calling a friend");
		 
	 }
	 
	 
	 
	 
 }
 //Q no 3
  class square{
	  
	  int side;
	  
	  
	  public int area() {
		  
		  return side*side;
	  }
	  
	  public int perimeter() {
		  return 4*side;
		  
	  }
  }
  
  //Q no 4
  class rectangle{
	  
	  
	  int length;
	  int bredth;
	  
	   public int area(){
		   return length*bredth;
	   }
	   public int perimeter(){
		   return 2*(length+bredth);
	   }
  }
 
  //Q no 5
 class tommy{
	 
	 
	 public void hit() {
		 System.out.println("hitting the enemy");
		 
	 }
	 public void run() {
		 System.out.println("running from the enemy");
		 
	 }
	 public void fire() {
		 System.out.println("firing the enemy");
		 
		 
	 }
	 public void crouch() {
		 System.out.println("crouching on the floor");
		 
	 }
 }
 //Q no 6;
   
 class circle{
	  
	  float radius;
	  float pi=22/7f;
	  
	  public float area() {
		  
		  return pi*radius*radius;
	  }
	  
	  public float perimeter() {
		  return 2*pi*radius;
		  
	  }
 }
 
 

 

 
 
  





public class oop_practise_set {

	
	
	public static void main(String[] args) {
		/*
		
		//problem 1
		Help prajwol= new Help();
		prajwol.setName("codeWithPrajwol");
		prajwol.salary=55000;
		System.out.println(prajwol.getName());
		
		System.out.println(prajwol.getSalary());
		
		
		//problem 2
		cellPhone samsung=new cellPhone();
		samsung.ring();
		samsung.vibrate();
		samsung.callFriend();
		
		*/
		
		//problem 3
		
		/*
		square boxes=new square();
		boxes.side=5;
		boxes.area();
		System.out.printf("the area  is %d\n",boxes.area());
		boxes.perimeter();
		System.out.printf("the perimeter  is %d",boxes.perimeter());
		*/
		
		//problem 4
		
		/*
		rectangle field=new rectangle();
		field.length=5;
		field.bredth=4;
		field.area();
		field.perimeter();
		System.out.printf("the area is %d",field.area());
		System.out.printf("the perimeter is %d",field.perimeter());
		*/
		
		//problem 5
		
		/*
		tommy Rockstar=new tommy();
		Rockstar.hit();
		Rockstar.run();
		Rockstar.fire();
		Rockstar.crouch();
		*/
		
		
		//problem 6
		circle ball=new circle();
		ball.radius=5f;
		ball.area();
		System.out.printf("the area is %f\n",ball.area());
		ball.perimeter();
		System.out.printf("the perimeter is %f",ball.perimeter());
		
		
		
	}
}
