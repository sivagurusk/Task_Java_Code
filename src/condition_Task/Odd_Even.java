package condition_Task;
import java.util.*;
public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number:");
		int value=in.nextInt();
		
		if(value%2==0) {
			System.out.println(value+" is a Even number..");
		}
		else {
			System.out.println(value+" is a Odd number..");
		}
	}

}
