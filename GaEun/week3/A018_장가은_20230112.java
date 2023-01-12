import java.util.Arrays;
import java.util.Scanner;

public class A018_장가은_20230112 {
	public static void main(String[] args) {

		Scanner s  = new Scanner(System.in);
		int n=s.nextInt();
		int A[]=new int[n];
		int B[]=new int[n];
		
		for(int i=0;i<n;i++) {
			A[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			B[i]=s.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		int sum=0;
		int num=n;
		for(int i=0;i<n;i++) {
			sum=sum+(A[i]*B[num-1]);
			num=num-1;
		}
		System.out.print(sum);
		
	}
}
