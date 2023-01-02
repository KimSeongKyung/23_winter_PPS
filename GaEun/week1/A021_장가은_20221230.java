import java.util.Scanner;

public class A021 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		
		for(int i=0; i<n; i++) {
			int num = s.nextInt();
			sum+=num;
		}
		System.out.println(sum-(n-1));
	}
}
