package condition_Task;
import java.util.*;
public class Vowels_Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the one letter Alpabets: ");
		char ch=in.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
			System.out.println(ch+" is a Vowels..");
		}
		else {
			System.out.println(ch+" is a Constants..");
		}
	}

}
