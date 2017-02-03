package module1;

public class ArithemeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 1 + 2;
		System.out.println("1 + 2  = " + result);
		int Original_result = result;
		//original_result = 3
		//result = 3
		
		result  += 1;
		//result = 2
		
		System.out.println(Original_result + " - 1 =  " + result );
		Original_result = result;
		//now Original_result is 2
		
		result *= 2;
		//result is 4 now
		System.out.println(Original_result + " * 2 = " + result);
		Original_result = result;
		
		result /= 2;
		//result is 2 now
		System.out.println(Original_result + " * 2 = " + result);
		Original_result = result;
		
		result += 8;
		//result is 10 now
		System.out.println(Original_result + " * 2 = " + result);
		Original_result = result;
		
		result %= 7;
		//result is 1 now
		System.out.println(Original_result + " % 2 = " + result);
		
		
		

		
		
		

	}

}
