/**************************************************************************/
/* Initializes two int variables called headCount and tailCount to zero.  Create a loop that iterates one-million times.  In the loop, initialize an int variable number and utilize a random number generator to randomly assign number a value of 0 or 1.  If number equals 0, increment headcount.  Else increment tailCount.  After the loop has finished iterating, display the count of heads and the count of tails.
/* Coded by: Evense Zetrenne
/**************************************************************************/

import java.util.Random;
public class Flip{
public static void main (String[] args){

   
      int headCount = 0;
      int tailCount = 0;
      Random r = new Random();
         for(int flips = 0; flips < 1000000; flips++)
         {
      
      int sides = r.nextInt(2);
         
         if(sides == 0) headCount++;
            
            else tailCount++;
}
System.out.println("There are " + headCount + " heads and " + tailCount + " tails.");
}
}

