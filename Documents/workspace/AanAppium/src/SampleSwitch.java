
public class SampleSwitch {
	
	public static void maibn(String[] args){
		
		int input = userin(3);
			
			switch(input){
			case 0: 
				input = 1;
				System.out.println("winter");
			break;
			
			case 1: 
				input = 2;
				System.out.println("Spring");
			break;
			
			case 2: 
				input = 3; 
				System.out.println("Autmn");
			break;
			
			case 3: 
				input = 4;
				System.out.println("Summer");
			break;
			
			case 4: 
				input = 5;
				System.out.println("you live in wierd climate");
			break;
			
			default:System.out.println("bad program");
			
			
			}
			
			
		
				
			}
	
	public static int  userin(int x){
		System.out.println(x);
		return x;
				
		

		
	}

}
