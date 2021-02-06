package Day_6_Lets_Review;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int t = myScanner.nextInt();
		myScanner.nextLine();
		
		for (int i = 0; i < t; i++) {
			String s;
			String even = "";
			String odd = "";
			
			s = myScanner.nextLine();
			
			for (int j = 0; j < s.length(); j++) {
				
				if(j %2== 0) {
					even+=s.charAt(j);
				}
				else {
					odd+=s.charAt(j);
				}
			}
			
			System.out.println(even+" "+odd);
		}
	}
}
