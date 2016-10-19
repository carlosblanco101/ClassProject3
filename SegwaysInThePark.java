import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class SegwaysInThePark {

  public static void main(String[] args) {
   
  // Scanner object
  Scanner scanner = new Scanner(System.in);
  int userAge;
  
  // Showing prompt and user input
  System.out.println("Enter your age");
  userAge = scanner.nextInt();
 
  // Procedeure
  
  // While loop on user's age
  while(userAge < 14)
   {
    System.out.println("I'm sorry, anyone aged 14 or less can't ride.");
   }
    if ( (userAge >= 14) && (userAge <= 21) )
   {
    System.out.println("Your price is $45 per ticket. Welcome aboard!");
   }
   else if (userAge >= 65)
   {
    System.out.println("Your price is $40 per ticket. Welcome aboard!");
   }
   else
   {
     System.out.println("Your price is $60. Welcome aboard!");
   }
   

   // Showing prompt and user input
  System.out.println("Enter your intended day of riding:");
  
  String userAnswer = scanner.nextLine();
  //String for days of the week
  String [] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
  
 // While loop on user's inteded day of riding
  while(userAnswer.equalsIgnoreCase("Tuesday"))
  {
    System.out.println("Unfortunately, there are no tours available for the day you entered");
    userAnswer = scanner.nextLine();
  }
   if (userAnswer.equalsIgnoreCase("Monday"))  
  {
    System.out.println("Our hour of operations are during regular business hours. Welcome aboard!");
  }
  else if (userAnswer.equalsIgnoreCase("Wednesay"))
    {
    System.out.println("Our hour of operations are during regular business hours. Welcome aboard!");
  }
  else if (userAnswer.equalsIgnoreCase("Thursday"))
    {
    System.out.println("Our hour of operations are during regular business hours. Welcome aboard!");
  }
  else if (userAnswer.equalsIgnoreCase("Friday"))
    {
    System.out.println("Our hour of operations are during regular business hours. Welcome aboard!");
  }
  else  if (userAnswer.equalsIgnoreCase("Saturday"))
    {
    System.out.println("Our hour of operations are during regular business hours. Welcome aboard!");
  }
 
  
 }
}
