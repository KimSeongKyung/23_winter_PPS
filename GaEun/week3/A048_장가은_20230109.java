import java.util.Scanner;

public class A048_장가은_20230109 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n= s.nextInt();
		s.nextLine();
		
		int count = 0; 
		
		for (int i = 0; i < n; i++) {
			String S = s.next();          
			boolean check[] = new boolean[26];
			boolean group = true; 
			
			for (int j = 0; j < S.length(); j++) {
				int index = S.charAt(j)-'a';  
				if(check[index]) {    
					if(S.charAt(j) != S.charAt(j-1)) {  
						group = false; 
						break;
					}
				}else {
					check[index] = true; 
				}
			}
			if(group) count++;
		}
		
		System.out.println(count);
	}

}
