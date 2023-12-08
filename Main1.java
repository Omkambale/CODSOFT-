import java.util.*;
public class Main1
{

  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    Random r = new Random ();

    int Low = 1;
    int High = 100;
    
     int selectedNo;
     selectedNo = r.nextInt (101);
    int GuessedNo;
    int trials = 0;

      System.out.println ("I have selected the number between " + Low +
			  " and " + High);

    do
      {
	System.out.print ("Guess the number: ");
	GuessedNo = sc.nextInt ();
	trials++;

	if (GuessedNo < selectedNo)
	  {
	    System.out.println ("No..! Try larger number.");
	  }
	else if (GuessedNo > selectedNo)
	  {
	    System.out.println ("No..! Try smaller number.");
	  }
	else
	  {
	    System.out.println ("Yes..! I have selected the number " +
				selectedNo +
				" And you guessed the number in " + trials +
				" attempts.");
	  }
	  
      }
    while (GuessedNo != selectedNo);

    sc.close ();
  }
}