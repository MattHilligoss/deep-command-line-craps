package edu.cnm.deepdive;

import java.time.Year;
import java.util.Scanner;

public class Play {

  public static void main(String[] args) {
    Craps craps = new Craps();
    do {
      craps.play();
     do {
        int diceSum = craps.roll();
        System.out.printf("Roll = %d%n" ,diceSum);
      }  while (craps.getState() != Craps.State.WIN && craps.getState() != Craps.State.LOSS);
      System.out.printf("Result = %s. Total plays = %d. Total wins = %d.%n",
      craps.getState().toString(), craps.getPlays(),craps.getWins());
      System.out.println ("Play Again (Y/N : ");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      char firstChar = input.toLowerCase(). charAt (0);
      if (firstChar != 'y') {
        break;
      }
      // Ask the user if they want to play again.
    } while (true);
    }

}
