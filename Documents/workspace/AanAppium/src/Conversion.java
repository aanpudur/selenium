
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b;
		int i = 257;
		double d = 323.142;
		
		System.out.println("conversion of int into byte");
		b = (byte) i;
		System.out.println("i and b \n" + i + "\n" + b);
		
		
		System.out.println("conversion of double into int");
		d = (double) i;
		System.out.println("i and d \n" + i + "\n" + d);

		
		System.out.println("conversion of double into byte");
		b = (byte) d;
		System.out.println("b and d \n" + b + "\n" + d);
	}
	
	

}
