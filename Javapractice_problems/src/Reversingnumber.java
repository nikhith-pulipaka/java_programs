import java.util.*;
public class Reversingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be reversed : ");
		int n=s.nextInt();
		s.close();
		int temp,rev=0;
		while(n!=0){
			temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		System.out.println("Reversed number is : "+rev);

	}

}
