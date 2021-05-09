import java.util.*;
public class Palindromenumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be checked : ");
		int n=s.nextInt();
		s.close();
		int temp,rev=0,n1;
		n1=n;
		while(n!=0){
			temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		if(n1==rev)
		System.out.println(n1+" is a Palindrome number.");
		else
			System.out.println(n1+" is not a Palindrome number.");

	}


}
