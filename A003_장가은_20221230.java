
public class A003_장가은_20221230 {
	public int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
             digits[i]++;
            return digits;
            }
            else 
                digits[i] = 0;
         }
    
        int[] num = new int [n+1];
        num[0] = 1;
    
        return num;
    }
}
