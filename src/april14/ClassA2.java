package april14;

public class ClassA2 {
	
	//Cunst : is a spcl methods which execute automatcally when object is created.
	//1. Its name must be same as class name
	//2. t doesnt have any return type, not even void.
	
	public ClassA2(){
		System.out.println("Suraj");
	}
	
	public void method1( int s, String s1){
		
		int t = s+ 3;
		//System.out.println(t);
		System.out.println(s1);
	}
	
	public static void main(String args[]){
		ClassA2 obj = new ClassA2();
		obj.method1(2, "Hello");
		
	}

}
//This is known as Method OverLoading : It happens in same class.