package in.piyush.wrestling;
import java.util.*;

public class Game {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);		
		List<Wrestler> wrestlers = Wrestler.defaultDeck();
		
		Collections.shuffle(wrestlers);
		
		List<Wrestler> playerOneCards = new ArrayList<Wrestler>();
		List<Wrestler> playerTwoCards = new ArrayList<Wrestler>();
		
		int index=0;
		for (Wrestler someWrestler : wrestlers) {
			if (index%2 == 0){
				playerOneCards.add(someWrestler);
			} else {
				playerTwoCards.add(someWrestler);
			}
			index++;
		}
		
		int lastIndex = playerOneCards.size()-1;
		System.out.println(playerOneCards.get(lastIndex).toString());
		
		System.out.println("Choose an attributte to bet on...\n1.\tRank\n2.\tHeight\n3.\tWeight\n4.\tMatches Won\n5.\tMatches Lost\n6.\tTotal Matches Played");
		int attributeChoice;
		userInput.hasNextInt();
		attributeChoice = userInput.nextInt();
		while (attributeChoice>=6 || attributeChoice<=0) {
			System.out.println("Please Enter correct choice");
			userInput.hasNextInt();
			attributeChoice = userInput.nextInt();			
		}

		System.out.println(playerTwoCards.get(lastIndex).toString());
		Wrestler defender=playerTwoCards.get(lastIndex);
		
		if(playerOneCards.get(lastIndex).wrestle(attributeChoice, defender)){
			System.out.println("****Player 1 Wins****");
			Wrestler removedCard = playerTwoCards.remove(lastIndex);
			playerOneCards.add(removedCard);
		}
		else {
			System.out.println("****Player 2 Wins****");
			Wrestler removedCard = playerOneCards.remove(lastIndex);
			playerTwoCards.add(removedCard);
		}
		userInput.close();
	}
}
