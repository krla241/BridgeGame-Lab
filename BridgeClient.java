import java.util.Scanner;
import java.io.*;
/*
 * @class Comp 150
 * @name Karla Sosa
 * @date  07/05/19
 */

public class BridgeClient
{
  public static void main (String [] args)
  {

    try
    {
      Scanner sc=new Scanner(new File("hands.txt"));
      
      while(sc.hasNext())
      {
        String hand=sc.nextLine();
        System.out.println("Analyzing hand: " + hand);
        Bridge bridge=new Bridge(hand);
        bridge.printHand(); //prints all 4 suits
        bridge.printTotalPoints();
        System.out.println();
      }
    }
    catch(FileNotFoundException fnfe)
    {
      System.out.println("Unable to find hands.txt file exiting");
    }

  }
}