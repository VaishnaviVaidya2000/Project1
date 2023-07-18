/*Write a program in Java to display n terms of natural numbers and their sum.*/
import java.util.Scanner;

public class sum_of_n_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of  n natural nos is:"+sum);

	}

}
