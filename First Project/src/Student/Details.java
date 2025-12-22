package Student;
import java.util.Scanner;
public class Details {
	public void getdetails() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name=in.nextLine();
		System.out.println("Enter your Age:");
		int age=in.nextInt();
		System.out.println("Enter your Register Number:");
		int reg=in.nextInt();
		System.out.println("Enter your Mobile Number:");
		long mobile=in.nextLong();
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Register Number: "+reg);
		System.out.println("Mobile Number: "+mobile);
	}

	public static void main(String[] args) {
	Details d1=new Details();
	d1.getdetails();
	Details d2=new Details();
	d2.getdetails();
	Details d3=new Details();
	d3.getdetails();
	Details d4=new Details();
	d4.getdetails();
	}

}
