package overconcept;

class Dog{
    public void bark(){
        System.out.println("woof ");
    }
}
class Hound extends OverridingTest{
    public void sniff(){
        System.out.println("sniff ");
    }
 
    public void bark(){
        System.out.println("bowl");
    }
}
 
public class OverridingTest{
    public static void main(String [] args){
        OverridingTest dog = new Hound();
        dog.bark();
    }

	private void bark() {
		// TODO Auto-generated method stub
		
	}
}