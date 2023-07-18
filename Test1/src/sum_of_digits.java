/*Write a Java method to compute the sum of the digits in an integer.*/
import java.util.Scanner;

public class sum_of_digits {
	int i,sum=0,rem;
	
	public int sum(int n) {
		for(i=0;i<=n;i++)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;	
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=sc.nextInt();
		sum_of_digits obj=new sum_of_digits();
		int n2=obj.sum(n1);
		System.out.println("Sum of digits of a number is:"+n2);
		
		}
}
