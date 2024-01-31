package javaPrajwol;
import java.util.Scanner;
public class practise {
public static void main(String[] args) {
	
	
	System.out.println("Enter the value of n : ");
	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
	multiplication(a);

	
}
//write a java method to print multiplication table of n
static void multiplication(int n) {
	
 for(int i=1;i<=10;i++) {
	 System.out.printf("%d * %d = % d",n,i,n*i);
	
	 
	 
 }
}


}

