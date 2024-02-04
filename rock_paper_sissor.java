package javaPrajwol;
import java.util.Scanner;
import java.util.Random;
public class rock_paper_sissor {
public static void main(String[] args) {
	

	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter yout number between(1-3)");
	int number=sc.nextInt();
	Random random = new Random();
	int randomN=random.nextInt(3);

	switch (number) {
	case 1:
		System.out.println(" user choice : rock");
		break;
	case 2:
		System.out.println(" user choice : paper");
		break;
	case 3:
		System.out.println(" user choice : scissor");
		break;
		
		default:
			System.out.println("Please enter valid number");
			System.exit(0);
	}
	
	switch (randomN) {
	case 1:
		System.out.println(" computer choice : rock");
		break;
	case 2:
		System.out.println(" computer choice : paper");
		break;
	case 3:
		System.out.println(" computer choice : scissor");
		break;
		
	}
	
	if(number==randomN) {
		System.out.println("Draw");
	}
		else if(number==1 && randomN==2|| number==2 && randomN==3 || number==3 && randomN==1) {
			System.out.println("computer wins");
		}
			else{
				System.out.println("You win");
			}
	}
	
	
	
	
	
	
}

