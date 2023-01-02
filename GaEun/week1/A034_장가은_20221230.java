import java.util.HashSet;
import java.util.Scanner;

public class A034 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashSet<Integer> num = new HashSet<Integer>();
		 
		for (int i = 0; i < 10; i++) {
			num.add(s.nextInt() % 42);
		}
        
		System.out.print(num.size());
		
	}
}
