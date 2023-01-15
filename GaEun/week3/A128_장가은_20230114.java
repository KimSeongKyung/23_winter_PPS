import java.util.Scanner;
import java.util.Stack;

public class A128_장가은_20230114 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		while (!s.equals(".")) {
			
			Stack<Character> st = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '(' || s.charAt(i) == '[') {
					st.push(s.charAt(i));
				}else {
					if(s.charAt(i) == ')') {
						if(!st.isEmpty() && st.peek() == '(') st.pop();
						else st.push(s.charAt(i));
					} else if( s.charAt(i) == ']') {
						if(!st.isEmpty() &&st.peek() == '[') st.pop();
						else st.push(s.charAt(i));
					}
					
				}
			}
			if(st.isEmpty()) System.out.println("yes");
			else System.out.println("no");
		
		}
	}


}
