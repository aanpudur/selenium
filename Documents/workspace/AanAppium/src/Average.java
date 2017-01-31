
public class Average {
	
	
	//find the average of the sets of numbers

	public static void main(String[] args){
		
		int i[] = {28, 38, 84998, 8938, 94043, 9858, 78, 99, 78};
		
		int sum = 0;
		int average;
		
		for(int x = 0; x < i.length; x++ ){
			
			sum  += i[x];
			
			
			
			
		}
		System.out.println(sum);
		average = sum / i.length;
		System.out.println(average);
		
		
		
	}
}
