package Reversenumber;

public class ReverseString {
public static void main(String args[]){
	char a = 0;
	//String a = null;
	String s= "Hello";
	char[] s1= s.toCharArray();
	int t=s1.length;
	System.out.println("lnght i s : " + t);
	
	for (int i=t-1; i<=t-1; i--){
		 a=s1[i];
		 System.out.println("data is : "+ a);
	}
	//System.out.println("data is : "+ a);
}
	
}
