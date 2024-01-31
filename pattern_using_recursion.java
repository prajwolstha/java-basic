package javaPrajwol;
import java.util.Scanner;
public class pattern_using_recursion {
public static void main(String[] args) {
	int r = 4;
    pattern_recur(r);
}
	
	static void pattern_recur(int rows) {
        if(rows > 0) {
            for(int i=rows; i>0; i--) {
                System.out.print("*");
            }
            System.out.println();
            pattern_recur(rows-1);
        }
    }

	
	

}
