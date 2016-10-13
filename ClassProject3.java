/**
 * Created by Carlos A. Blanco
 */
import java.util.*;
class ClassProject3 {
    public static void main(String[] args) {

      Scanner reader = new Scanner(System.in); 
      String answer = reader.next();
      int age = reader.nextInt();
      int day;
      String s1 = "Tuesday";
      String s2 = "tuesday";
      
      
      System.out.println("Enter your age: ");
      
      if (age < 14) {
       System.err.println("You can't ride");     
      } else if (age >= 65)
      { System.out.println("What day of the week do you intend to ride?");
        answer = reader.next();
        
        if (answer.equalsIgnoreCase(s2)){
          System.err.println("I'm sorry, we don't offer tours on this day");
        } else {
          System.out.println("Your total is: $40. Enjoy!");
      }
      
    
    }
    }
}

    