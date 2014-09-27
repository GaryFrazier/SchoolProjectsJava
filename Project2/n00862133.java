/* Author: Gary Frazier
   Assignment: 2
   Date: 9/9/14
   This code computes 2 summations: Starting at 1/3 and moving to the next 
   denominator and numerator until (n-2)/n, where n is an odd input.
   The second approxomates pi using the same input as the last denominator for the 
   summation.
*/

import java.util.Scanner;


public class n00862133
{
   //main method
   public static void main(String[] args)
   {
   
      //local declarations
      Scanner input = new Scanner(System.in);
      int n;
      double sum1 = 0.0;
      double sum2 = 0.0;
      boolean odd = true;
     
      
      //Ask user to input an odd integer as the target denominator
     
     
      System.out.print("\nPlease input an odd integer that you want to use as the last denominator for the summations: "); 
      n = input.nextInt();
      
      //calculate summation 1 and round off to 8 decimal places
      
      for(int i = 1; i <= n - 2; i += 2)
      {
         sum1 += (i / (i + 2.0));
      }
   
      sum1 *= 100000000;
      sum1 = (int) (sum1 / 1.0);
      //check last digit for rounding purposes
      if(sum1 % 10 >= 5)
      {
         sum1 = ((sum1 + 1.0) / 100000000.0);
      }
      
      else
      {
         sum1 /= 100000000.0;
      }
      
      
      
      //calculate summation 2 and round off to 8 decimal places
      
      
      for(int i = 1; i <= n; i += 2)
      {
         //if odd, add, else, subtract
         if(odd)
         {
            sum2 += (1.0 / i);
            odd = false;
         }
         
         else
         {
            sum2 -= (1.0 / i);
            odd = true;
         }      
      }
      
      sum2 *= 4;
      sum2 *= 100000000;
      sum2 = (int) (sum2 / 1.0);
      //check last digit for rounding purposes
      if(sum2 % 10 >= 5)
      {
         sum2 = ((sum2 + 1.0) / 100000000.0);
      }
      
      else
      {
         sum2 /= 100000000.0;
      }
      
      
      
      //Print results
      
      System.out.println("\nThe result of the first summation is " + sum1);
      System.out.println("\nThe result of the second summation (the approxomation of pi) is " + sum2);
      
      
   }//end of main

}