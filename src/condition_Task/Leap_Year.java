package condition_Task;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year=in.nextInt();
		
		if(year%400==0 || (year%4==0 && year%100!=0)) {
				System.out.println(year+" is a Leap year..");
		}else {
			System.out.println(year+" is not a Leap year..");
			
		}
		
	}

}
