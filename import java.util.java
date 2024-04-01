import java.util.Scanner;
public class ProgramSummary{
    public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      long phoneNumber;
      long tempNumber;
      long lastFour;
      long firstFour;
      long prefixNumber;
      
      System.out.println("Please enter the landline phone number:");
      phoneNumber = scnr.nextLong();
      
      tempNumber = phoneNumber;
   
      lastFour = tempNumber % 10000;
      tempNumber = tempNumber / 10000;
      
      firstFour = tempNumber % 10000;
      tempNumber = tempNumber / 10000;
   
      prefixNumber = tempNumber % 1000;
      tempNumber   = tempNumber / 1000;
      
      System.out.println("Please enter the mobile phone number:");
      System.out.println();
      System.out.print("Your landline number is: ");
      System.out.println("+" + prefixNumber + " " + firstFour + " " + lastFour);
      
      phoneNumber = scnr.nextLong();
      
      tempNumber = phoneNumber;
   
      lastFour = tempNumber % 1000;
      tempNumber = tempNumber / 1000;
      
      firstFour = tempNumber % 1000;
      tempNumber = tempNumber / 1000;
   
      prefixNumber = tempNumber % 10000;
      tempNumber   = tempNumber / 10000;
      
      System.out.print("Your mobile number is: 0");
      System.out.println(prefixNumber + " " + firstFour + " " + lastFour);
    }
}