package methodParameter;
public class MinFinder{
	public void findMinimum(int x, int y, int z){
		if(x < y && x < z)
			System.out.println("Minimum = " + x);
		else if (y < z)
			System.out.println("Minimum = " + y);
		else 
			System.out.println("Minimum = " + z);
	
	}
	public static void main(String[] args){
		MinFinder min = new MinFinder();
		min.findMinimum(2,3,4);
	}

}