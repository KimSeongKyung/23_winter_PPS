import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A130_장가은_20230113 {
	public static void main(String[] args) {

		Scanner s  = new Scanner(System.in);
		
		int n=s.nextInt();
		s.nextLine();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		List<Integer> list = new ArrayList<Integer>();

	    for(int i = 0 ; i < n ; i++){
	    	if(arr[i] == 0)
	    		list.remove(list.size() - 1);
	        else
	            list.add(arr[i]);
	        }

	    int sum = 0;
	        
	    for(int i : list) {
	    	sum += i;
	    }
	    System.out.println(sum);      
	}

}

