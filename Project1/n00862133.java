import java.util.Scanner;

/*
Code by : Gary Frazier
Date: 8/39/2014
This code prompts the user to enter the drive distance, fuel efficiency in miles per gallon,
and price per gallon. It then displays the price of the trip.
*/


public class n00862133
{
   public static void main(String[] args)
   {
      //local declarations
      double distance;
      double mpg;
      double costPerGallon;
      double totalCost;
      Scanner input = new Scanner(System.in);
      
      //prompt user for driving distance
      
      System.out.print("Enter the driving distance: ");
      distance = input.nextDouble();
      
      //prompt user for the miles per gallon
      System.out.print("Enter miles per gallon: ");
      mpg = input.nextDouble();
      
      //prompt user for the price per gallon
      System.out.print("Enter the price per gallon: ");
      costPerGallon = input.nextDouble();
      
      //calculate the total cost
      totalCost = (distance / mpg * costPerGallon);
      
      //print the total cost of the trip
      System.out.println("The cost of driving is $" + totalCost);
      
   
   }//main

}