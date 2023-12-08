import java.util.*;

class Main2
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
      System.out.print ("Enter the number of subject: ");
    int sub = sc.nextInt ();
    int total = 0;
    int marks;
      System.out.println ("Enter the marks(out of 100) for each subject");
    for (int i = 1; i < sub + 1; i++)
      {
	System.out.print ("Enter marks for subject" + i + ": ");
	marks = sc.nextInt ();
	total += marks;
      }
    System.out.println ("Total marks: " + total + "/" + sub * 100);
    double average = (double) total / sub;
    System.out.println ("Average: " + average);

    if (average > 90)
      {
	System.out.println ("you have get the gread A");
      }
    else if (80 < average && average >= 90)
      {
	System.out.println ("You have get the gread B");

      }
    else if (70 < average && average >= 80)
      {
	System.out.println ("You have get the gread C");
      }
    else if (60 < average && average >= 70)
      {
	System.out.println ("You have get the gread D");
      }
    else if (50 < average && average >= 60)
      {
	System.out.println ("You have get the gread E");
      }
    else
      {
	System.out.println ("You have get the gread F");
      }
    sc.close ();
  }
}