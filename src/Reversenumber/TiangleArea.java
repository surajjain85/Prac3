package Reversenumber;

import java.util.Scanner;

public class TiangleArea {
	
	public static void main(String args[]){
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter height");
		double height=scan.nextDouble();
		
		System.out.println("enter length");
		
		double length=scan.nextDouble();
		
		double area= (height*length)/2;
		System.out.println("area of triangle: "+ area);
		
	}

}
