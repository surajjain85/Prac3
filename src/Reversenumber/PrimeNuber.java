package Reversenumber;

import java.util.Scanner;

public class PrimeNuber {
	static int temp;
	static boolean isprime=true;
	
	public static void main(String args[]){
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a no. for chck :");
		
		int nu=scan.nextInt();
		for (int i=2;i<=nu/2 ;i++){
			temp= 	nu%i;
			if (temp==0){
				isprime=false;
				break;
			}
			
		}
		if (isprime){
			System.out.println(nu +" no. is prime	");
		}
		else{
			System.out.println(nu + " is not prime");
		}
	}

}
