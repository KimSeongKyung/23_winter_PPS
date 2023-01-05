import java.math.BigInteger;

public class A063_장가은_20230103 {
	 public String addBinary(String a, String b) {
	        BigInteger bigIntegerA = new BigInteger(a, 2);
	        BigInteger bigIntegerB = new BigInteger(b, 2);
	       
	        return bigIntegerA.add(bigIntegerB).toString(2);
	    }
}
