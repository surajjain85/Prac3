package april14;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Score=40;
		
		switch (Score)
		{
		case 90: 
			System.out.println("very good");
			break;
			
		case 60:
			System.out.println("good");
			break;
		case 40: 
			System.out.println("fair");
			break;
			
			default:
				System.out.println("u r fail");
				break;
		}

	}

}
