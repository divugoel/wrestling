package in.piyush.wrestling;
import java.util.*;
import java.lang.Math;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to the Wrestling Virtual Cards Game \nThis is a two Players' game as of now!\nPlease Enter Players' names respectively");
		
		userInput.hasNext();
		String player1Name = userInput.nextLine();
		userInput.hasNext();
		String player2Name = userInput.nextLine();
		String playerAttacking;
		String playerDefending;
		
		System.out.println("*********************************************************\nDeciding who gets to bet first");
		int chance = (int)(Math.random()*2);	
		
		if (chance == 1) {
			playerAttacking = player1Name;
			playerDefending = player2Name;			
		}
		else {
			playerAttacking = player2Name;
			playerDefending = player2Name;			
		}
		System.out.println (playerAttacking+" gets to bet first\n*********************************************************");
		
		
		int totalWrestlers =5;
		Wrestler wrestler1 = new Wrestler("Undertaker", 3, 2.08, 136.0, 198, 45);
		Wrestler wrestler2 = new Wrestler("Roman Reigns", 1, 1.93, 120.0, 87, 13);
		Wrestler wrestler3 = new Wrestler("Daniel Bryan", 2, 1.78, 90.71, 149, 41);
		Wrestler wrestler4 = new Wrestler("Dean Ambrose", 4, 1.92, 102.0, 51, 10);
		Wrestler wrestler5 = new Wrestler("Brock Lesnar", 5, 1.91, 134.0, 71, 30);
		//TODO input more wrestlers... 
		//Wrestler Wrestler6 = new Wrestler();
		//Wrestler Wrestler7 = new Wrestler();
		//Wrestler Wrestler8 = new Wrestler();
		Wrestler wrestlers[] = {wrestler1, wrestler2, wrestler3, wrestler4, wrestler5};
		
		int attackingWrestler=(int)(Math.random()*totalWrestlers);
		
		System.out.println("Displaying "+playerAttacking+"'s top card");
		wrestlers[attackingWrestler].display();
		
		System.out.println("Choose an attributte to bet on...\n1.\tRank\n2.\tHeight\n3.\tWeight\n4.\tMatches Won\n5.\tMatches Lost\n6.\tTotal Matches Played");
		int attributeChoice;
		userInput.hasNextInt();
		attributeChoice = userInput.nextInt();
		
		int defendingWrestler =(int)(Math.random()*totalWrestlers);
		while (attackingWrestler == defendingWrestler) {
			defendingWrestler =(int)(Math.random()*totalWrestlers);			
		}
		
		Wrestler defender=wrestlers[defendingWrestler];
		boolean result = wrestlers[attackingWrestler].wrestle(attributeChoice, defender);
		
		if (result) {
			System.out.println("****"+playerAttacking+" Wins****");
		}
		else{
			System.out.println("****"+playerDefending+" Wins****");
		}
		
		userInput.close();		
	}

}
