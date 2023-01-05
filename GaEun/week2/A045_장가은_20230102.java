import java.util.Scanner;

public class A045_장가은_20230102 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String n=s.next().toUpperCase();
		
		int arr[] = new int[26];
		
		for(int i=0;i<n.length();i++) {
			int number=n.charAt(i)-'A';
			arr[number]++;
		}
		

		int max=0;
		char alpa='?';
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				alpa=(char)(i+'A');
			}
			else if(max==arr[i]) {
				alpa='?';
			}
		}
		System.out.println(alpa);
		

	}
}
