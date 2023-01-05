import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B032_장가은_20230105 {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        Integer[] arr = new Integer[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = s.nextInt();
	        }
	        Arrays.sort(arr, Collections.reverseOrder());
	        int max = 0;
	        for (int i = 0; i < n; i++) {

	            max = Math.max(max, arr[i] + i + 1);
	        }

	        max += 1;
	        System.out.println(max);
	    }
}



