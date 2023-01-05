import java.util.Arrays;
import java.util.Scanner;

public class B064_장가은_20230102 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n = s.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);

        int result = s.nextInt();
        int sum = 0;
        int count = 0;
        int end = n-1;
        int start = 0;

        while(start<end) {
            if (arr[start] + arr[end] == result) {
                count++;
                start++;
                end--;
            } else if (arr[start] + arr[end] < result)
                start++;

            else
                end--;
        }
        
        System.out.println(count);
      }
}
