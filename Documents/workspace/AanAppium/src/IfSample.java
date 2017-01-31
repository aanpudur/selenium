
public class IfSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y;
		
		x = 10;
		y = 20;
		
		if( x < y ){
			System.out.println("Wah Great job, you got the correct answer");
		}
		
		x = x * 2;
		
		if(  x == y){
			System.out.println(" x now equal to y");
			
			
		}
		
		x = x * 2;
		
		if( x > y ){
			System.out.println(" wrong answer both are equal");
		}
		
		if( x == y ){
			
			System.out.println(" this wouldn't print");
		}
		
		

	}

}
