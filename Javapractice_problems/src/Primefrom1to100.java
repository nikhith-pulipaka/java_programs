public class Primefrom1to100 {
	public static void main(String[] args) {
	    for (int i = 2; i < 1000; ++i) {
	      boolean isPrime = true;
	      int sqrt = (int)Math.ceil(Math.sqrt(i));
	      for (int divisor = 2; divisor <= sqrt; ++divisor) {
	        if (i % divisor == 0) {
	          isPrime = false;
	          break;
	        }
	      }
	      if (isPrime) {
	        System.out.println(i);
	      }
	    }
	  }


}
