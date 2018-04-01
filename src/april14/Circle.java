package april14;

public class Circle {
	
	//area of square
	
	public void square(){
		
		double r=2.5;
		double area= r*r;
		
		System.out.println(area);
	}
	
	// area of rect.
	public void rectangle(){
		double l=5.2;
		double b=5;
		
		double area=l*b;
				System.out.println(area);
	}
	
// area of circle
public void circlemethod(int r){
	double a =3.14;
	//int r = 5;
	
	double area=a*r*r;
	System.out.println(area);
	
}
//table of 2
public void printTable(){
	
	for(int i =1; i<=10; i++){
		
		int s = i*2;
		System.out.println(s);
	
	if(s == 14){
		break;
	}
		
	}
	
}

	public static void main(String args[])
	{
		Circle obj = new Circle();
		///obj.printTable();
		//obj.rectangle();
		//obj.square();
		obj.circlemethod(6);
	}
}
