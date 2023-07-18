import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd no:");
		int b=sc.nextInt();
		
		if(a>b)
		{
			for(i=b+1;i<a && i>b;i++)
			{
				for(j=1;j<=10;j++)
				{
					System.out.println(i+"X"+j+"="+(i*j));
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
