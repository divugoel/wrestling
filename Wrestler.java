package in.piyush.wrestling;

public class Wrestler {
	public String name;
	public int rank;
	public double height;
	public double weight;
	public int matchesWon;
	public int matchesLost;
	public int totalMatches;
	
	public Wrestler(String Name, int Rank, double Height, double Weight, int MatchesWon, int MatchesLost) {
		this.name = Name;
		this.rank = Rank;
		this.height = Height;
		this.weight = Weight;
		this.matchesWon = MatchesWon;
		this.matchesLost = MatchesLost;
		this.totalMatches = MatchesWon+MatchesLost;
	}
	
	public void display(){
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println ("Name = "+this.name+"\nRank = "+this.rank+"\nHeight = "+this.height+" m\nWeight = "+this.weight+"kgs \nMathces Won = "+this.matchesWon+"\nMathces Lost = "+this.matchesLost+"\nTotal Matches Played = "+this.totalMatches);
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public boolean wrestle (int choice, Wrestler obj) {
		//some code here
		return true;
	}
	
}
