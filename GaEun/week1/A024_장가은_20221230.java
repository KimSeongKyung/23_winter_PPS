
public class A024_장가은_20221230 {
	 public boolean lemonadeChange(int[] bills) {
	        int five=0, ten=0;
	        
	        for(int b : bills) {
	            if(b==5){
	                five++;
	            }
	            else if(b==10) {
	                ten++;
	                five--;
	            }
	            else if(b==20 && ten==0) {
	                five-=3;
	            }
	            else{
	                ten--;
	                five--;
	            }
	            
	            if(five<0 || ten<0) return false;
	        }
	        
	        return true;
	    }
}
