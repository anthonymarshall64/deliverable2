package deliverable2;

import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;

public class Coinflip {
	
	public static void main(String[] args) {

	String headsandTailsGuess;
	int numberOfFlips=0;
	int correctCount=0;
	
	
		System.out.println("Guess which will have more: heads or tails?");
	Scanner userEntry = new Scanner(System.in);
	
	
	headsandTailsGuess = userEntry.nextLine();
	
	System.out.println("How many times shall we flip a coin?");
	Scanner userEntry2 = new Scanner(System.in);
	
	
	numberOfFlips = Integer.parseInt(userEntry2.nextLine());
	for(int i=0; i <numberOfFlips; i++) {
		if (Math.random()>0 && Math.random()<0.5) {
		System.out.println("heads");
		if (headsandTailsGuess.equals ("heads")) {
			correctCount++;
		}
	}
	else {
		System.out.println("tails");
		if (headsandTailsGuess.equals ("tails")) {
			correctCount++;
		}
	
	}}
	double correctpercentage = (Double.valueOf(correctCount) / Double.valueOf(numberOfFlips)) * 100;
		System.out.println("your guess, " + headsandTailsGuess + ", came up " + correctCount + " time(s)");
		System.out.println("that's " + correctpercentage + "%");
	

	}
	
	}
	

		

		
		
		
		
		
	
		
		
