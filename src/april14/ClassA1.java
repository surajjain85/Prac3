package april14;

public class ClassA1 {
	
	public void method1(int s){
		
		int t = 3+ 3;
		System.out.println(t);
	}
	
	public void method1(){
		
		System.out.println("Java");
	}
	
	public void method2(){
		
		System.out.println("Hello");
	}
	
	public static void main(String args[]){
		ClassA1 obj = new ClassA1();
		obj.method1();
		//obj.method2();
	}

}
//This is known as Method OverLoading : It happens in same class.