import java.util.*;
public class Changechar {
    public static void main(String[] input)
    {
        char ch;
        int temp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Character in Lowercase : ");
        ch = scan.next().charAt(0);
		scan.close();
        temp = (int) ch;
        temp = temp - 32;
        ch = (char) temp;
		
        System.out.print("Equivalent Character in Uppercase = " +ch);
    }


}
