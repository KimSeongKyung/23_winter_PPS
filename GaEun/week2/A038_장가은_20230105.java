
public class A038_장가은_20230105 {
	 public int mySqrt(int x) {
	        long start = 0;
	        long end = x;
	        while (start + 1 < end) {
	            long mid = (start + end) >> 1;
	            if (mid * mid < x) {
	                start = mid;
	            } else if (mid * mid > x) {
	                end = mid;
	            } else {
	                return (int)mid;
	            }
	        }
	        if (end * end <= x) {
	            return (int)end;
	        } else {
	            return (int)start;
	        } 
	    }
}
