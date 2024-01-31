package javaPrajwol;
import java.util.Scanner;
public class sum_of_natural_no_Recursive {
public static void main(String[] args) {
	
	
	System.out.println("Enter the value of n : ");
	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	int c=sum(a);
	System.out.println(c);

}
static int sum(int n) {
	if(n==1) {
		return 1;
		
	}else {
		
		return n+sum(n-1);
	}
	
	
}

   }
