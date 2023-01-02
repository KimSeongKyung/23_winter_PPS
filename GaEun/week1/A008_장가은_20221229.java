import java.util.Scanner;

public class A008 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);	
		
		int[] arr;
		int num = s.nextInt();
		
		for(int i=0;i<num;i++) {
			int N =s.nextInt();
			arr =new int[N];
			
			double sum=0;
			
			for(int j=0;j<N;j++) {
				int grade = s.nextInt();
				arr[j]=grade;
				sum=sum+grade;
			}
			
			double mean = (sum/N);
			double count=0;
			
			for(int j=0;j<N;j++) {
				if(arr[j]>mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
	}
}