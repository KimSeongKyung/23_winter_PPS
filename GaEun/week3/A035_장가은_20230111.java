import java.util.Scanner;

public class A035_장가은_20230111 {
	public static void main(String[] args) {

		Scanner s  = new Scanner(System.in);
		
		int n=s.nextInt();
		s.nextLine();

		for(int i=0;i<n;i++) {
			String a= s.nextLine();
			String[] arr = a.split(" ");
			double sum=-1;
			
			for(int j=0;j<arr.length;j++) {  
				if(j==0) {
					sum=Double.parseDouble(arr[0]);  	
				}
				else {
					switch (arr[j]) {
					case "@":
						sum *= 3;
						break;
					case "%":
						sum += 5;
						break;
					case "#":
						sum -= 7;
						break;
					default:
						break;
					}
				}
				if (j == arr.length -1)
					System.out.printf("%.2f%n", sum);
			}
			
		}
	}
}
