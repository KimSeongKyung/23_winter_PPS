import java.util.Scanner;

public class A020 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum1=0;
		int sum2=0;
		int sum3=0;
		for(int i=0;i<4;i++) {
			if(i==0) {
				int n1=s.nextInt();
				int n2=s.nextInt();
				sum1=n2;
			}
			if(i==1) {
				int n1=s.nextInt();
				int n2=s.nextInt();
				sum2=sum1-n1+n2;
			}
			if(i==2) {
				int n1=s.nextInt();
				int n2=s.nextInt();
				sum3=sum2-n1+n2;
			}
			
		}
		int max;
		if (sum1 >= sum2 && sum1 >= sum3) {
	            max = sum1;
	        } 
		else if (sum2 >= sum1 && sum2 >= sum3) {
	            max = sum2;
	        } 
		else 
	            max = sum3;
	    System.out.println(max);   
	}

}
