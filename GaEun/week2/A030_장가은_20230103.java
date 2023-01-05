import java.util.Scanner;

public class A030_장가은_20230103 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int a=s.nextInt();
		s.nextLine();
		double b=0;
		double c=0;
		
		double arr[] = new double[4];
		for(int i=0;i<4;i++) {
			arr[i]=s.nextDouble();
		}
		if(a==1) {
			b=arr[2];
			c=arr[3];
		}
		else {
			b=arr[0];
			c=arr[1];
		}
		double k;
		double l;
		 for(int i=0 ; i < n-1 ; i++){
		      k = b*arr[0] + c*arr[2];
		      l = c*arr[3] + b*arr[1];
		      b = k;
		      c = l;
		    } 

		    int q = (int)(b*1000);
		    int w = (int)(c*1000);
		    
		    System.out.println(q);
		    System.out.println(w);
	}
}
