import java.util.Arrays;
import java.util.Scanner;

public class A081_장가은_20230110 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		s.nextLine();
		int number[]=new int[n];
		
		int arr[] = new int[10];
		for(int i=0;i<n;i++) {
			for(int j=0;j<10;j++) {
				arr[j]=s.nextInt();
			}
			Arrays.sort(arr);
			number[i]=arr[7];
		}
		for(int i=0;i<n;i++) {
			System.out.println(number[i]);
		}
	}
}
