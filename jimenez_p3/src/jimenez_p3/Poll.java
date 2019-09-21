package jimenez_p3;

import java.util.Scanner;

public class Poll {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		System.out.println("Welcome to my polling system!!");
		System.out.println("How many participants will be in this poll?");
		
		n = scan.nextInt();
		
		
		
		int i, j , k, l, m, o;
		String topics [] = {"UCF football" , "2020 Electoral Campaign" , "Global Warming" , "Student Debt" , "Military Budget"};
		
		int responses[][] = new int[5][10];
		
		for(i=0; i<5 ;i++) {
			System.out.println("Please enter each participant's vote from 1-10(most important) the following topic:" + topics[i] );
			
			for(j=0 ; j<n; j++) {
				responses[i][j] = scan.nextInt();
			}
		}
		
		double avg[] = new double [5];
		
		for(k=0; k<5; k++) {
			for(l=0; l<n; l++) {
				avg[k] += responses[k][l]; 
			}
			avg[k]/= n;
		}
		
		for(m=0; m<5; m++) {
			System.out.print(topics[m]);
			System.out.print(" Votes: ");
			for(o=0; o<n; o++) {
				System.out.print( "  " + responses[m][o]);
			}
			System.out.println("  average: " + avg[m]);
		}
		
		double largest_number = 0;
		int index1= 0, index2 = 0;
		int x;
		for(x=0; x<5; x++) {
			if(largest_number < avg[x]) {
				largest_number = avg[x];
				index1 = x;
				
				
			}
			
		}
		System.out.println("The most important topic is: " + topics[index1]);
		
		double smallest_number = 10;
		int y;
		
		for(y = 0; y < 5; y++) {
			if(smallest_number > avg[y]) {
				smallest_number = avg[y];
				index2 = y;
				
				
			}
			
		}
		System.out.println("The least important topic is: " + topics[index2]);
		
	}

}
