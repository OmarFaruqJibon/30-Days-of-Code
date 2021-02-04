package Day_3_Intro_to_Conditional_Statements;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int n= myScanner.nextInt();
		
		if(n%2!=0) {
			System.out.println("Weird");
		}else {
			if(n>=2 && n<=5) {
				System.out.println("Not Weird");
			}
			if (n>=6 && n<=20) {
				System.out.println("Weird");
			}
			if (n>20) {
				System.out.println("Not Weird");
			}
		}

	}

}
