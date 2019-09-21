package jimenez_p1;

import java.util.Scanner;

public class decryption {
	public static void main(String[] args) {
		
		int i, j, k;
		
		System.out.println("Enter 4 digits to be decrypted (separeted by space)");
		
		int value[]= new int[4];
		
		Scanner scan = new Scanner(System.in);
		for(i=0; i<4; i++) {
			value[i] = scan.nextInt();
			
		}
		
		int final_value[] = new int[4];
		final_value[0] = value[2];
		final_value[1] = value[3];
		final_value[2] = value[0];
		final_value[3] = value[1];
		
		
		for(j=0; j<4; j++) {
			if(final_value[j]== 0) {
				final_value[j] = 3;
			}
			else if(final_value[j]== 1) {
				final_value[j] = 4;
			}
			else if(final_value[j]== 2) {
				final_value[j] = 5;
			}
			else if(final_value[j]== 3) {
				final_value[j] = 6;
			}
			else if(final_value[j]== 4) {
				final_value[j] = 7;
			}
			else if(final_value[j]== 5) {
				final_value[j] = 8;
			}
			else if(final_value[j]== 6) {
				final_value[j] = 9;
			}
			else if(final_value[j]== 7) {
				final_value[j] = 0;
			}
			else if(final_value[j]== 8) {
				final_value[j] = 1;
			}
			else if(final_value[j]== 9) {
				final_value[j] = 2;
			}
			else {
				System.out.println("Error");
			}
		}
		
		for(j=0; j<4; j++) {
			System.out.print(final_value[j]);
		}
 	}

}
