/* Name: Gary Frazier
   Date: 9/15/14
   This program makes the user input two 3 X 3 arrays and
   tests to see if they have equal elements in the same
   order. It prints a statement showing if they are 
   strictly equal or not. There are various other methods 
   to test equality in certain scenarios.
*/



import java.util.Scanner;



public class n00862133
{
   public static void main(String[] args)
   {
 
   
      //create the lists
      int[][] list1 = new int[3][3];
      int[][] list2 = new int[3][3];
      
      //fill lists
      System.out.print("Enter list1 (9 ints): ");
      list1 = fill(list1);
     
      
      System.out.print("Enter list2 (9 ints): ");
      list2 = fill(list2);
      
      //run tests
      System.out.println("\nThe equals method returns " + Strict.equals(list1,list2));
      
      System.out.println("\nThe number of equal values is " + Strict.howMany(list1,list2));
      
      System.out.println("\nThe number of equal values along the diagonal is " + Strict.diagonal(list1,list2));
      
      System.out.printf("\nThe average of the values is %.2f\n", Strict.average(list1, list2));
      
      Strict.display(list1,list2);
      
      System.out.println("\nThe silly method returns " + Strict.silly(list1,list2));
   }//main
   
   //fills list with user input
   public static int[][] fill(int[][] list)
   {
   
       //creates scanner
      Scanner input = new Scanner(System.in);
      
      //nested loop to traverse the arrays
      for(int i = 0; i < list.length; i++)
      {
         for(int j = 0; j < list[i].length; j++)
         {
            list[i][j] = input.nextInt();
         }
      }
      return list;
   
   }//fill
   
}//n00862133



//Strict class
class Strict
{

   
  
   //This method compares two 2 dimensional arrays
   //and prints if they are exactly equal.
   public static boolean equals(int[][] m1, int[][] m2)
   {
   
      //starts true, false if something is found  to be not equal
      boolean strictlyEqual = true;
      
      //nested loop to traverse the arrays
      for(int i = 0; i < m1.length; i++)
      {
         for(int j = 0; j < m1[i].length; j++)
         {
            //checks if values are equal
            if(!(m1[i][j] == m2[i][j]))
            {
               strictlyEqual = false;
            }
         
         }
      }
      
      return strictlyEqual;  
      
   }//equals
   
   
   
   //returns how many cell values are identical
   public static int howMany(int[][] m1, int[][] m2)
   {
      //int to store how many are equal
      int numEqual = 0;
      
      //traverse arrays
      for(int i = 0; i < m1.length; i++)
      {
         for(int j = 0; j < m1[i].length; j++)
         {
               if(m1[i][j] == m2[i][j])
               {
                  numEqual++;
               }       
         }
      }
      
      return numEqual;
   
   }//howMany
   
   
   
   
   //returns how many cells are identical on the diagonal
   public static int diagonal(int[][] m1, int[][] m2)
   {
      //int to store how many are equal
      int numEqual = 0;
      
      
      //traverse arrays
      for(int i = 0; i < m1.length; i++)
      {
         if(m1[i][i] == m2[i][i])
         {
            numEqual++;
         }
      }
      
      return numEqual;
      
   
   }//diagonal
   
   
   
   //finds average of all values in both arrays
   public static double average(int[][] m1, int[][] m2)
   {
      //local declarations for average and numValues
      double average = 0.0;
      double numValues = 0.0;
      
      //traverse arrays
      for(int i = 0; i < m1.length; i++)
      {
         for(int j = 0; j < m1[i].length; j++)
         {
            average += m1[i][j];
            average += m2[i][j];
            
            numValues += 2.0;  
         }
      }
      
      //calculate average
      average /= numValues;
      return average;
   
   }//average
   
   //Displays the array, but only ones with odd values
   public static void display(int[][] m1, int[][] m2)
   {
      //traverse array and print number if it is odd
      
      //Array 1
      System.out.println("\nOdd values in array 1:\n");
      for(int i = 0; i < m1.length; i++)
      {
         for(int j = 0; j < m1[i].length; j++)
         {
            if( m1[i][j] % 2 != 0 )
            {
               System.out.print(m1[i][j] + "\t");
            }
            else
            {
               System.out.print("\t");
            }
            
          
         }
         System.out.println("\n");
      }
      
      
      //Array2
      System.out.println("Odd values in array 2:\n");
      for(int i = 0; i < m2.length; i++)
      {
         for(int j = 0; j < m2[i].length; j++)
         {
            if( m2[i][j] % 2 != 0 )
            {
               System.out.print(m2[i][j] + "\t");
            }
            else
            {
               System.out.print("\t");
            }
            
          
         }
         System.out.println("\n");
      }
   }//Display
   
   
   //the silly method returns true if 1 < numbers <= 10; false otherwise
   public static boolean silly(int[][] m1, int[][] m2)
   {
      //return this boolean at the end
      boolean numbers = true;
      
      //traverse and check arrays
      for(int i = 0; i < m1.length; i++)
      {
         for(int j = 0; j < m1[i].length; j++)
         {
            //check number range
            if(!(m1[i][j] > 1 && m1[i][j] <= 10))
               numbers = false;
            if(!(m2[i][j] > 1 && m2[i][j] <= 10))
               numbers = false;
         }
      }
      
      return numbers;
   }//silly
   

}//Strict