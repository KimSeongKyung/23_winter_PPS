import java.util.Scanner;

public class A022 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		int sumY=0;
		int sumM=0;
		for(int i=0;i<n;i++) {
			int time=s.nextInt();
			int Y=time/30;
			int M=time/60;
			int YP=0;
			int MP=0;
			for(int j=0;j<=Y;j++) {
				YP=YP+10;
			}
			for(int j=0;j<=M;j++) {
				MP=MP+15;
			}
			sumY=sumY+YP;
			sumM=sumM+MP;
		}
		if(sumY<sumM) {
			System.out.println("Y "+sumY);
		}
		else if(sumM<sumY) {
			System.out.println("M "+sumM);
		}
		else
			System.out.println("Y M "+sumY);
	}
}
