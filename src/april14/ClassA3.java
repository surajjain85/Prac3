package april14;

public class ClassA3 {
	
	public void method1(int num){
		//Code to check if number is even or odd
		
		//int a=6;
		//int b=3;
		
		int s = num%2;
		
		if(s==0){
			System.out.println("Even");
		}
		
		else{
			System.out.println("Odd");
		}
	}
	
	public static void main(String args[]){
		ClassA3 obj = new ClassA3();
		obj.method1(0);
	}

}
