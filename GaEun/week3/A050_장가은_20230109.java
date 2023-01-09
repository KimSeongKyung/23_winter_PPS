import java.util.Scanner;

public class A050_장가은_20230109 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String a=s.nextLine();
		char [] arr=new char[a.length()];
		
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)-3<'A') {
				arr[i]= (char)(a.charAt(i)+23);
			}
			else {
		        arr[i]=(char)(a.charAt(i)-3);
			}
		}
		for(int i=0;i<a.length();i++) {
		    System.out.print(arr[i]);
		}
		
	}
}



     
 

