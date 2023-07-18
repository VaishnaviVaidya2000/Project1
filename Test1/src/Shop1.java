import java.util.Scanner;

public class Shop1 {
	
	public float purchase_bill(float a1,int q1,float a2,int q2,float a3,int q3) {
		float purchase=(a1*q1+a2*q2+a3*q3);
		return (purchase);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount for Asus");
		float amount1=sc.nextFloat();
		System.out.println("Enter the Quantity for Asus");
		int quantity1=sc.nextInt();
		System.out.println("Enter the Amount for Dell");
		float amount2=sc.nextFloat();
		System.out.println("Enter the Quantity for Dell");
		int quantity2=sc.nextInt();
		System.out.println("Enter the Amount for HP");
		float amount3=sc.nextFloat();
		System.out.println("Enter the Quantity for HP");
		int quantity3=sc.nextInt();
		System.out.println("Product"+" "+ "Amount"+" "+"Quantity");
		System.out.println("Asus"+"	"+amount1+"	"+quantity1);
		System.out.println("Dell"+"	"+amount2+"	"+quantity2);
		System.out.println("HP"+"	"+amount3+"	"+quantity3);
		Shop1 obj=new Shop1();
		float bill=obj.purchase_bill(amount1,quantity1, amount2, quantity2, amount3,quantity3);
		System.out.println("Total purchase bill**"+bill+"**");
		
	}

}
