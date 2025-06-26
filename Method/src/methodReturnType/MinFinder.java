package methodReturnType;
public class MinFinder{
	public int findMinimum(int x, int y, int z){
		
		if(x<y && x<z)
			
			return x;
			
		else if(y<z)
			
			return y;
			
		else 
			
			return z;
	}
	
	public static void main(String[] args){
		MinFinder min = new MinFinder();
		int z = min.findMinimum(5,7,3);
		
		System.out.println("Minimum= "+ z);
	}

}