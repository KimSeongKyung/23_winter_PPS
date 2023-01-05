import java.util.Scanner;

public class A052_장가은_20230105 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		s.nextLine();
		int score=0;
		int total_score=0;
		int total[] =new int[n];
		for(int i=0;i<n;i++) {
			score=0;
			total_score=0;
			String q=s.nextLine();
			char arr[]=q.toCharArray();
			int num[]=new int[arr.length];
			for(int j=0;j<arr.length;j++) {
				if(arr[j]=='O') {
					score=score+1;
					num[j]=score;
				}
				else {
					score=0;
					num[j]=score;
				}
			}
			for(int j=0;j<num.length;j++) {
				total_score=total_score+num[j];
				total[i]=total_score;
			}
			
		}
		for(int i=0;i<n;i++) {
			System.out.println(total[i]);
		}
	}
}

