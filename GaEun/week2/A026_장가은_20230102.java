
public class A026_장가은_20230102 {
	 public boolean solution(int x) {
	        boolean answer = true;
	        
	        int sum=0;
	        int num=x;
	        
	        while(x!=0){ 
	            sum=sum+(x%10);
	            x=x/10;
	        }
	        if(num%sum==0)
	            return answer;
	        else
	            return false;
	 }
}
