
public class A027_장가은_20230102 {
	public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int n = number.length();
        int index = 0;
        int t = n - k;    
        
        for (int i = 0; i < t; i++) {
            char max = '0';
                for (int j = index; j <= k + i; j++) {
                    char tmp = number.charAt(j);
                        if(max < tmp) {
                            max = tmp;
                            index = j + 1;
                         }
                }
            sb.append(max);
         }
        return sb.toString();
    }
}
