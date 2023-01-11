import java.util.Scanner;

public class A019_장가은_20230111 {
	public static void main(String[] args) {

		Scanner s  = new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		int sum=a*b*c;
		int arr[] =new int[10];
		
		while (sum > 0) {
			arr[sum % 10]++;
			sum /= 10;
		}
		
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}
}