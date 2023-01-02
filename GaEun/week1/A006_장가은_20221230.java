
public class A006_장가은_20221230 {
	    boolean solution(String s) {
	        boolean answer = true;
	        int count = 0;
			char ch = ' ';
			
			for (int i = 0; i < s.length(); i++) {
				ch = s.charAt(i);
				if(ch == 'p' || ch== 'P')
					count++;
				else if (ch == 'y' || ch == 'Y')
					count--;
			}
			if(count != 0)
				return false;

	        return answer;
	    }
}
