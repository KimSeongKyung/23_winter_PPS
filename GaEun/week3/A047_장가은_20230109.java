import java.util.Scanner;

public class A047_장가은_20230109 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String a=s.nextLine();
		char arr[]= a.toCharArray();
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			count++;
			if(count==10) {
				System.out.println();
				count=0;
			}
		}
			
	}

}
