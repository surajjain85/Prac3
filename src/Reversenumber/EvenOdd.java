package Reversenumber;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String args[]){
		int num;
		
		System.out.println("enter a number: ");
		
		
		Scanner scan= new Scanner(System.in);
		num= scan.nextInt();
		
		if (num%2==0){
			System.out.println(" no. is even");
		}
		else {
			System.out.println("no. is odd");
		}
	}

}
