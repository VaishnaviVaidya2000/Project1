/* Print sum of digits in a string */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		String s1="12345";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
				sum+=s1.charAt(i)-'0';
			}
			
		}
		System.out.println(sum);
		
	}

}
