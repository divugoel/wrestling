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
	
}
