import java.util.*;
public class Sumofdigits {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=s.nextInt();
		s.close();
		int sum=0,temp;
		while(n!=0){
			temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		System.out.println("Sum of the digits of given number is : "+sum);

	}

}
