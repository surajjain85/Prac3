package Reversenumber;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String args[]){
		int num=0;
		int reversnu=0;
		System.out.println("plese enter no.");
		
		Scanner in = new Scanner(System.in);
		num=in.nextInt();
		
		while(num!=0){
			reversnu=reversnu *10;
			reversnu=reversnu +num%10;
			num=num/10;
		}
		System.out.println("reverse of input no.: "+ reversnu);
	}

}
