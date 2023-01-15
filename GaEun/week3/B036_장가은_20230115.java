import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B036_장가은_20230115 {
public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String exp = br.readLine();
		String [] arr = exp.split("\\-");
    
		int answer = cal(arr[0]); 
 
		for(int i=1; i<arr.length; i++) {
			answer -= cal(arr[i]); 
		}
		System.out.println(answer);
		}
	
		public static int cal(String exp) { // + 계산
			String [] temp = exp.split("\\+");
			int result = 0;
			
			for(int i=0; i<temp.length; i++) {
				result += Integer.parseInt(temp[i]);
			}
			
			return result;
		}
}
