import java.util.Scanner;

public class B035_장가은_20230115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(), K = sc.nextInt();

		int []coin = new int[N];

		int count = 0;
		
		for (int i = 0; i < N; i++) {
			coin[i] = sc.nextInt();
		}
				for (int i = N-1; i >= 0; i--) {
			if(K >= coin[i]) {
				count += (K / coin[i]);
				K = (K % coin[i]);
			}
		}
	
		System.out.println(count);
	}

}
