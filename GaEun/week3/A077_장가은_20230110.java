import java.util.Arrays;
import java.util.Scanner;

public class A077_장가은_20230110 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int [][] arr = new int[8][2];
		int [] hi = new int[5];
		int sum=0;
		
		for(int i=0;i<8;i++) {
			arr[i][0]=s.nextInt();
			arr[i][1]=i+1;
		}
		Arrays.sort(arr,(int[]a,int[]b)->{
			return b[0]-a[0];
		});
		
		for(int i=0;i<5;i++) {
			sum=sum+arr[i][0];
			hi[i]=arr[i][1];
		}
		
		Arrays.sort(hi);
		
		System.out.println(sum);
		for(int i=0;i<5;i++) {
			System.out.print(hi[i]+" ");
		}
	}

}
