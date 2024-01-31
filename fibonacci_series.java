package javaPrajwol;
import java.util.Scanner;
public class fibonacci_series {
public static void main(String[] args) {
	//0 1 1 2 3 5 8 13 21....n
	System.out.println("Enter the value of n : ");
	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	
	
	fibo(a);
	System.out.println(fibo(a));
}

static int fibo(int n) {
//	if(n==1){
//		return 0;
//	}
//		else if (n==2) {
//			return 1;
//		}
	
	if(n==1||n==2) {
		return n-1;
	}
		
	
	else {
		return fibo(n-2)+fibo(n-1);
		
	}
}

}
