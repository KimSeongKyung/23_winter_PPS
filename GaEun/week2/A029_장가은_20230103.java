import java.util.Scanner;

public class A029_장가은_20230103 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n= s.nextInt();
		int door=s.nextInt();
			
		if(n>5) {
			System.out.print("Love is open door");
		}
		else {
			for(int i=0;i<n-1;i++) {
				if(door==1) {
					System.out.println("0");
					door=0;
				} 
				else {
					System.out.println("1");
					door=1;
				}
			}
		}
	}
}
