package Reversenumber;

import java.util.Scanner;

public class SumArray {
		
	public static void main (String args[]){
		Scanner scan= new Scanner(System.in);
		int[] array= new int[5];
		int sum=0;
		System.out.println("enter no.: ");
		for (int i=0; i<10; i++){
			array[i]=scan.nextInt();
			
		}
		
		for (int num:array){
			sum= sum+num;
			
		}
		System.out.println("sum of an array: "+ sum);
	}

}
