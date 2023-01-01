import java.math.BigInteger;
import java.util.Scanner;

public class A028 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		BigInteger A = new BigInteger(s.next());
		BigInteger B = new BigInteger(s.next());
		
		BigInteger C = A.add(B);
		
		System.out.println(C);
	}
}
