
public class A122_장가은_20230116 {
	public boolean rotateString(String A, String B) {
	    return A.length() == B.length() && (A + A).indexOf(B) != -1;
	  }
}
