
public class BoxDemo {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		
		Box mybox = new Box();
		double vol;
		
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
		
		vol = mybox.width * mybox.height * mybox.depth;
		System.out.println("The volume is " + vol);
		
		int chekInt = (int) vol;
		System.out.println("The volume in int is " + chekInt);
		
		
 	}

}
