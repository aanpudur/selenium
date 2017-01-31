
public class IfElse {
	
	public static void main(String[] args){
		int month = 8;
		String season;
		
		if(month == 12 || month ==1 || month ==2){
			System.out.println("It is winter");
			
		}else if(month ==3 || month ==4 || month == 5)
		{System.out.println("It is Spring");
			
			
		}else if(month == 6 || month == 7 || month == 8){
			System.out.println("it is summer");
		}
		else if(month == 9 || month == 10 || month == 11){
			System.out.println("This is winter");
		}else{
			System.out.println("Input right month");
		}
		
		
	}

}
