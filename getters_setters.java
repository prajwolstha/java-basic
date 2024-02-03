package javaPrajwol;
//checking area and circumference of circle
class ccircle{
	private int radius,area,circumference;
	private int pi=22/7;
	
	public void setRadius(int r) {
      radius =r;
	}
	
	  
	public int  getArea() {
		return pi*radius*radius;
	}
	
	public void setArea(int a) {
		area=pi*radius*radius;
	if(area==a)	{
	System.out.println("correct area is :");
	}
	else {
   System.out.println("Wrong outcome in area");
	}
	
	}
	public int  getCircumference() {
		return 2*pi*radius;
	}
	
	public void setCircumference(int c) {
		circumference=2*pi*radius;
		if(circumference==c) {
			System.out.println("correct perimeter is :");
		}else {
			System.out.println("wrong outcome in circumference");
		}
	}
	
	
	
	
	
}




public class getters_setters {
public static void main(String[] args) {
	
	ccircle cr=new ccircle();
	cr.setRadius(3);
	cr.setArea(27);
	System.out.println(cr.getArea());
	cr.setCircumference(18);
	System.out.println(cr.getCircumference());
	
	
	
	
	
}

}
