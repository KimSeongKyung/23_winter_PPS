import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B077_장가은_20221230 {
	 public static void main(String args[]) {
	        
	        List<BigInteger> data = new ArrayList<>();
	 
	        data.add(BigInteger.ZERO);
	        data.add(BigInteger.ONE);
	 
	        Scanner s = new Scanner(System.in);
	        int num = s.nextInt();
	 
	        if (0 == num) {
	            System.out.println(data.get(0));
	            return;
	        }
	 
	        if (1 == num) {
	            System.out.println(data.get(1));
	            return;
	        }
	 
	        for (int i = 2; i <= num; i++) {
	            data.add(i, data.get(i - 1).add(data.get(i - 2)));
	        }
	 
	        System.out.println(data.get(num));
	    }
	 
	}