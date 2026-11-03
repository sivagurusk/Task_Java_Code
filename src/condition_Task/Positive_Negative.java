package condition_Task;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the value: ");
		int value=in.nextInt();
		
		if(value>=0) {
			System.out.println(value+" is a Postive number..");
		}
		else {
			System.out.println(value+" is a negative number..");
		}
	}

}
