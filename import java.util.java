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
      
      firstFour = tempNumber % 1000;
      tempNumber = tempNumber / 1000;
   
      prefixNumber = tempNumber % 100;
      tempNumber   = tempNumber / 100;
   
      System.out.println("+" + prefixNumber + " " + firstFour + " " + lastFour);
      
      System.out.println("Please enter the mobile phone number:");
      phoneNumber = scnr.nextLong();
      
      tempNumber = phoneNumber;
   
      lastFour = tempNumber % 10000;
      tempNumber = tempNumber / 10000;
      
      firstFour = tempNumber % 1000;
      tempNumber = tempNumber / 1000;
   
      prefixNumber = tempNumber % 100;
      tempNumber   = tempNumber / 100;
      
    }
}