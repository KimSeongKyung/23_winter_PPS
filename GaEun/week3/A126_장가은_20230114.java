import java.util.Scanner;

public class A126_장가은_20230114 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0; 
		for (int i = 1; i <= num; i++) { 
			if (i <= 99) { 
				count += 1;
			} else if (i <= 999) { 
				String[] num_str = Integer.toString(i).split(""); 
				if ((Integer.parseInt(num_str[1]) - Integer.parseInt(num_str[0])) == (Integer.parseInt(num_str[2])- Integer.parseInt(num_str[1]))) { 
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
}
