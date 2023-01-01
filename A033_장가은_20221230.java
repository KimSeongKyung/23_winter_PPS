import java.util.Scanner;

public class A033 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[]=new int[5];
		int max = 0;
        int num = 0;
		for (int i =0 ; i < 5; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            arr[i] = a + b + c + d;
        }

        for (int i =0 ; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
                num = i+1;
            }
        }

        System.out.println(num + " " +max);
	}
}
