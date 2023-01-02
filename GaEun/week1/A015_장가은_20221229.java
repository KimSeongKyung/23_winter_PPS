import java.util.Scanner;

public class A015 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++) {
			int num=s.nextInt();
			int num2=num*num;
			sum=sum+num2;
		}
		int n=sum%10;
		System.out.println(n);
	}
}
