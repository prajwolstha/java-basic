package javaPrajwol;

class cylinder{
	
	private int radius;
	private int height;
	
	
	
	public cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	
	public int surfaceArea() {
		
		return 2*22/7*radius*height+2*22/7*radius;
		
	}
	public int volume() {
		return 22/7*radius*radius*height;
	}
	
}




public class practise_set_access_modifier_constructors {
public static void main(String[] args) {
	//using constructor
	cylinder math=new cylinder(3,10);
	System.out.println(math.surfaceArea());
	System.out.println(math.volume());
	
	
	//using getter & setter
//	cylinder math=new cylinder();
//    math.setRadius(3);
//    math.setHeight(10);
//    System.out.println(math.getRadius());
//    System.out.println(math.getHeight());
//    System.out.println(math.surfaceArea());
//    System.out.println(math.volume());
//	
	
    
	
}
}
