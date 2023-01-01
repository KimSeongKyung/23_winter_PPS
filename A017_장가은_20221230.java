import java.util.Scanner;

public class A017_장가은_20221230 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		int num=num1*num2*num3;
		
		int arr[] =new int[10];
		
		while(num>0) {
			arr[num%10]++;
			num=num/10;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
