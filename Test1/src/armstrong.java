/*if a>b print table of numbers between and b if a<b print sum of odd numbers between a and b */
import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,i,j;
		System.out.println("Enter First number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		
		if(a>b) {
		for(i=b+1;i<a && i>b;i++) {
			for(j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			
		}
	}
		else if(a<b) {
			for(i=a+1;i>a&&i<b;i++) {
				if(i%2==1) {
				sum=sum+i;
				}
			}
			System.out.println("Sum of odd Numbers between a and b"+sum);
		}

	}

}
