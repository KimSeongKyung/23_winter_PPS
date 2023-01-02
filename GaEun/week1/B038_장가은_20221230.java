import java.util.Arrays;
import java.util.Scanner;

public class B038_장가은_20221230 {	
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int appleNum = s.nextInt();
        int birdLength = s.nextInt();
        int h[] = new int[appleNum];
        
        for(int i = 0; i < appleNum; i++) {
            h[i] = s.nextInt();
        }

        Arrays.sort(h);

        for(int i = 0; i < appleNum; i++) {
            if(h[i] <= birdLength) birdLength++;
        }
        System.out.println(birdLength);


    }
}
