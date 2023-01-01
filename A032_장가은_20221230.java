import java.util.Scanner;

public class A032_장가은_20221230 {
		public static void main(String[] args) {
			
			Scanner s= new Scanner(System.in);

		    int[][] people = new int[15][15];
		 
			for(int i = 0; i < 15; i++) {
				people[i][1] = 1;	
				people[0][i] = i;	
			}
		 
		 
			for(int i = 1; i < 15; i ++) {	
				for(int j = 2; j < 15; j++) {	
						people[i][j] = people[i][j - 1] + people[i - 1][j];
				}
			}
				
						
			int n = s.nextInt();
				
			for(int i = 0; i < n; i++) {
				int floor = s.nextInt();
				int ho = s.nextInt();
				System.out.println(people[floor][ho]);
			}	
		}
}
