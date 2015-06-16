package in.piyush.wrestling;

import java.util.*;

public class Wrestler {
	public String name;
	public int rank;
	public double height;
	public double weight;
	private int matchesWon;
	private int matchesLost;
	private int totalMatches;
	
	public Wrestler(String name, int rank, double height, double weight, int matchesWon, int matchesLost) {
		
		this.name = name;
		this.rank = rank;
		this.height = height;
		this.weight = weight;
		this.matchesWon = matchesWon;
		this.matchesLost = matchesLost;
		this.totalMatches = matchesWon + matchesLost;
		
	}
	
	public String toString() {
		return "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"+"Name = "+this.name+"\nRank = "+this.rank+"\nHeight = "+this.height+" m\nWeight = "+this.weight+" kgs\nMathces Won = "+this.matchesWon+"\nMathces Lost = "+this.matchesLost+"\nTotal Matches Played = "+this.totalMatches+"\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
	}
	
	public int setMatchesWon(int wins) throws Exception {
		if(wins < this.matchesWon) {
			throw new Exception("How come the matches won decrease!");
		}
		this.matchesWon = wins;
		
		this.totalMatches = this.matchesWon + this.matchesLost;
		
		return wins;
	}
	
	public void incrementMatchesWon() {
		this.matchesWon++;
		
		this.totalMatches++;
	}
	
	public static List<Wrestler> defaultDeck() {
		List<Wrestler> deck = new ArrayList<Wrestler>();
		
		deck.add(new Wrestler("Undertaker", 1, 10.5, 100.0, 40, 5));
		deck.add(new Wrestler("Hulk Hogan", 2, 10.5, 100.0, 40, 5));
		deck.add(new Wrestler("HHH", 5, 10.5, 100.0, 40, 5));
		deck.add(new Wrestler("Kane", 17, 10.5, 100.0, 40, 5));
		
		return deck;
	}
	
	public boolean wrestle (int choice, Wrestler obj) {

		boolean result = false;
		switch (choice) {
		case 1 : if (this.rank < obj.rank)
			result = true;
		else
			result = false;
		break;
		
		
		case 2 : if (this.height > obj.height)
			result = true;
		else
			result = false;
		break;
		
		
		case 3 : if (this.weight > obj.weight)
			result = true;
		else
			result = false;
		break;
		
		
		case 4 : if (this.matchesWon > obj.matchesWon)
			result = true;
		else
			result = false;
		break;
		
		
		case 5 : if (this.matchesLost < obj.matchesLost)
			result = true;
		else
			result = false;
		break;
		
		
		case 6 : if (this.totalMatches > obj.totalMatches)
			result = true;
		else
			result = false;
		break;
		
		}
		return result;
		//Returns true if 'this' wrestler wins
		//Returns false if 'obj' wrestler wins
	}
}


