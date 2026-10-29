package oops_concepts_task;

class Student{
	public void display(String name,long rollno,int mark) {
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll_no: "+rollno);
		System.out.println("Student Mark: "+mark);
	}
}
public class Inherit_Student_Management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.display("Guru", 83276l, 91);
		s1.display("Siva", 3767283l, 85);
	}

}
