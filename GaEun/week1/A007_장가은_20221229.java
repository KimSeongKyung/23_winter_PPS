import java.util.Scanner;

public class A007 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String num = s.nextLine();
		String asc="1 2 3 4 5 6 7 8";
		String des="8 7 6 5 4 3 2 1";
		
		if(num.equals(asc)) {
			System.out.print("ascending");
		}
		else if(num.equals(des)) {
			System.out.print("descending");
		}
		else {
			System.out.print("mixed");
		}
	}
}
