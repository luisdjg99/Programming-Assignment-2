package jimenez_p1;

import java.util.Scanner;

public class encryption {

	public static void main(String[] args) {
		
		int i, j, k;
		System.out.println("Enter 4 digits to be encrypted  (each digit separated by space)");
		
		int value[] = new int[4];
		
		Scanner scan = new Scanner(System.in);
		
		for(i=0 ; i<4 ; i++) {
			value[i] = scan.nextInt();
		    value[i]+=7;
		    value[i]%=10;
		    
		}
		
		
		
		int final_value[] = new int[4];
		
		
		final_value[0] = value[2];
		final_value[1] = value[3];
		final_value[2] = value[0];
		final_value[3] = value[1];
		
		
		
		for(k=0 ; k<4; k++) {
			System.out.print(final_value[k]);
		}
			
	}
}
