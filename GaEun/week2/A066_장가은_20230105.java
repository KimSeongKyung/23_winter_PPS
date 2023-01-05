import java.util.Arrays;
import java.util.Scanner;

public class A066_장가은_20230105 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String n=s.nextLine();
		
		char arr[] =n.toCharArray();
		Arrays.sort(arr);
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}

}
