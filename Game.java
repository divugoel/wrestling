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
		String playerChosen;
		
		System.out.println("*********************************************************\nDeciding who gets to bet first");
		int chance = (int)(Math.random()*2);	
		
		if (chance == 1)
			playerChosen = player1Name;
		else
			playerChosen = player2Name;
			System.out.println (playerChosen+" gets to bet first\n*********************************************************");
		
		
		Wrestler wrestler1 = new Wrestler("Undertaker", 3, 2.08, 136.0, 198, 45);
		Wrestler wrestler2 = new Wrestler("Roman Reigns", 1, 1.93, 120.0, 87, 13);
		Wrestler wrestler3 = new Wrestler("Daniel Bryan", 2, 1.78, 90.71, 149, 41);
		Wrestler wrestler4 = new Wrestler("Dean Ambrose", 4, 1.92, 102.0, 51, 10);
		Wrestler wrestler5 = new Wrestler("Brock Lesnar", 5, 1.91, 134.0, 71, 30);
		//Wrestler Wrestler6 = new Wrestler();
		//Wrestler Wrestler7 = new Wrestler();
		//Wrestler Wrestler8 = new Wrestler();
		Wrestler wrestlers[] = {wrestler1, wrestler2, wrestler3, wrestler4, wrestler5};
		
		int randomWrestler=(int)(Math.random()*5);
		randomWrestler--;
		
		System.out.println("Displaying "+playerChosen+"'s top card");
		wrestlers[randomWrestler].display();
		
		
		
		
		
		userInput.close();		
	}

}
