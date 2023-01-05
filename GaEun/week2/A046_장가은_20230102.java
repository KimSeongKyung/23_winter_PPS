import java.util.Scanner;

public class A046_장가은_20230102 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n =s.nextInt();
		int [] arr=new int[26];
		s.nextLine();
		
		for(int i=0;i<n;i++) {
			String alpa=s.nextLine();
			char a=alpa.charAt(0);
			arr[a-97]++;
		}
		
		boolean pre=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=5) {
				System.out.print((char)(i+97));
				pre=false;
			}
		}
		if(pre)
			System.out.println("PREDAJA");
	}
}
