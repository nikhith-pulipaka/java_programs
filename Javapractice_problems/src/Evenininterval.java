import java.util.*;
public class Evenininterval {
    public static void main(String[] args){
    	Scanner s=new Scanner(System.in);
    	int a=s.nextInt();
    	int b=s.nextInt();
    	s.close();
	for (int i =a; i<b; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
   }
}
