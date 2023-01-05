import java.util.Arrays;
import java.util.Scanner;

public class A065_장가은_20230105 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		s.nextLine();
		
		int arr1[]=new int[5];
		int arr2[]=new int[5];
		
		for(int i=0;i<n;i++) {
			arr1[i]=s.nextInt();
			arr2[i]=s.nextInt();
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]+" "+arr2[i]);
		}
		
	}
}
