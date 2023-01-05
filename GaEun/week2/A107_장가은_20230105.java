import java.util.ArrayList;
import java.util.Scanner;

public class A107_장가은_20230105 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();

		int num = 1;
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			arr.add(num);
			count++; 
			if (num == count) { 
				num++;
				count = 0;
			}
		}
		
		int sum = 0;
		for (int i = num1 - 1; i <= num2 - 1; i++) {
			sum += arr.get(i);
		}
		System.out.println(sum);
	}
}


