import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A101_장가은_20230112 {
	public static void main(String[] args) {

		Scanner s  = new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		int arr[] = new int[n];
		int sum=0;
		int total3=0;
		int total4=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		double total1=(double)(sum/n);
		System.out.println(Math.round(total1));
		
		Arrays.sort(arr);
		System.out.println(arr[n/2]);
		
		int[] plus = new int[4002];
		int[] minus = new int[4001];
		for(int i=0;i<n;i++) {
			if(arr[i] <0) {
				minus[Math.abs(arr[i])]++;
			}
			else {
				plus[arr[i]]++;
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		
		int max = 0;
		for(int i=0; i<plus.length;i++) {
			max = Math.max(max, plus[i]);	
		}
		for(int i=0; i<minus.length;i++) {
			max = Math.max(max, minus[i]);
		}

		for(int i : arr) {
			if(i<0) {
				if(minus[Math.abs(i)] == max && !(list.contains(i))) {
					list.add(i);
				}
			}
			else {
				if(plus[i] == max && !(list.contains(i))) {
					list.add(i);
				}
			}
		}
		

		if(list.size()>=2) {
			total3 = list.get(1);
		}

		else {
			total3 = list.get(0);
		}
		System.out.println(total3);
		
		total4 = arr[n-1] - arr[0];
		System.out.println(total4);
		
	}
}
