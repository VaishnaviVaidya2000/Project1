/*Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays 
the name of the weekday.*/
import java.util.Scanner;

public class printday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		int day=sc.nextInt();
		if(day==1) {
			System.out.println("Monday");
		}
		else if(day==2) {
			System.out.println("Tuesday");
		}
		else if(day==3) {
			System.out.println("Wednesday");
		}
		else if(day==4) {
			System.out.println("Thursday");
		}
		else if(day==5) {
			System.out.println("Friday");
		}
		else if(day==6) {
			System.out.println("Saturday");
		}
		else if(day==7) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("Invalid day");
		}
		

	}

}
