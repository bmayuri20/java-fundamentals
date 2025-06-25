package app;
// SETTER AND GETTER TASK: -

import java.util.Scanner;

public class GalaxyInfo{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Galaxy g = new Galaxy();
		
		System.out.println("Enter galaxy name, area and distance");
		
		g.setGname(sc.nextLine());
		g.setGarea(sc.nextDouble());
		g.setGdistance(sc.nextLong());
		
		System.out.println(g.getGname()+ "  "+ g.getGarea()+"   "+g.getGdistance());
		
	}
}