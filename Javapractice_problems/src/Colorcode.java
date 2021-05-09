import java.util.*;
public class Colorcode {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the color code:");
		char ch=s.next().charAt(0);
		s.close();
		switch(ch){
		case 'R':
		case 'r':
			System.out.println("Red");
			break;
		case 'B':
		case 'b':
			System.out.println("Blue");
			break;
		case 'G':
		case 'g':
			System.out.println("Green");
			break;
		case 'o':
		case 'O':
			System.out.println("Orange");
		    break;
		case 'Y':
		case 'y':
			System.out.println("Yellow");
			break;
		case 'W':
		case 'w':
			System.out.println("White");
			break;
		}
	}

}
