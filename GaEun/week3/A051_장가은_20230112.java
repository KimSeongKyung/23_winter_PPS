import java.util.Scanner;

public class A051_장가은_20230112 {
	public static void main(String[] args) {

		Scanner s  = new Scanner(System.in);
		
		String n=s.nextLine();
		int sum=0;
		char arr[]=n.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) 
				sum=sum+2;
			if(arr[i]=='A' || arr[i]=='B' || arr[i]=='C')
				sum=sum+3;
			if(arr[i]=='D' || arr[i]=='E' || arr[i]=='F')
				sum=sum+4;
			if(arr[i]=='G' || arr[i]=='H' || arr[i]=='I')
				sum=sum+5;
			if(arr[i]=='J' || arr[i]=='K' || arr[i]=='L')
				sum=sum+6;
			if(arr[i]=='M' || arr[i]=='N' || arr[i]=='O')
				sum=sum+7;
			if(arr[i]=='P' || arr[i]=='Q' || arr[i]=='R' || arr[i]=='S')
				sum=sum+8;
			if(arr[i]=='T' || arr[i]=='U' || arr[i]=='V')
				sum=sum+9;
			if(arr[i]=='W' || arr[i]=='X' || arr[i]=='Y' || arr[i]=='Z')
				sum=sum+10;
			
		}
		System.out.print(sum);
	}
}
