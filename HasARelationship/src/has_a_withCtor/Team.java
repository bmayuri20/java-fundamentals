package has_a_withCtor;

public class Team{
	Player player;
	
	public Team(Player player){
		this.player = player;
	}
	
	public void display(){
		System.out.println(player.name);
		System.out.println(player.position);
	}
	
	
	public static void main(String[] args){
		Player player1 = new Player("Sachin", "Captain");
		
		Team team = new Team(player1);
		team.display();
	}
}