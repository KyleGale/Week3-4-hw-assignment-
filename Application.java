
public class Application {

  public static void main(String[] args) {    
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93,};
    //Programmatically subtract the value of the first element in the array from the value in the last element of the array
    //(i.e. do not use ages[7] in your code). Print the result to the console.  
    System.out.println(ages[0] - ages[ages.length - 1]);
    
    //Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
    
    //Use a loop to iterate through the array and calculate the average age. Print the result to the console         
    double sum = 0;
    for (int numbers : ages) {
      sum += numbers;
    }
    System.out.println(sum / ages.length);
    
   //Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
   String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
   
   //Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
   int numberOfLetters = 0;
   for(String name : names) {
     numberOfLetters += name.length();
   }
   System.out.println(numberOfLetters);
   System.out.println(numberOfLetters / names.length);
   
   
   //Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
   String anything = "";
   for(int i = 0; i < names.length; i++) {   
     anything += names[i] + " ";
    }
     System.out.println(anything);
   //How do you access the first element of any array?
   //The first element in any array always starts with zero
   
   for(int i = 0; i < names.length; i++) {
    }
   //Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array
   //and add the length of each name to the nameLengths array.
   
   int[] nameLengths = {3, 5, 3, 5, 4, 3}; 
   
   //Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
   int total = 0;
   for(int numbers : nameLengths) {
      total += numbers;
     }
   System.out.println(total);
   
   String trippleHello = multiplyString("Hello", 3);
   System.out.println(trippleHello);
   
   
   String firstName = "Kyle";
   String lastName =  "Gale";
   String fullName = giveFullName(firstName, lastName);
   System.out.println(fullName);
   
   int[] numbers = { 1, 2, 3, 4, };
   System.out.println(arraySumOfNumbers(numbers));
   
   double[] array = {23, 4 , 17, 89};
   System.out.println(calculateAverage(array));
   
   double[] arrayTwo = {19, 24, 8, 56};
   System.out.println(calculateAverageForTwo(array, arrayTwo));
   
   boolean isHotOutside = true; 
   double moneyInPocket = 9;
   System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
   
   int time = 9; 
   System.out.println(sleepSchedule(time));
   
  }
  
   // Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
   //(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
   
    public static String multiplyString(String x, int y) {
      String result = "";
      for(int i = 0; i < y; i++) {
        result += x;
      }
        return result;
    }
        
    // Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
        
    public static String giveFullName(String x, String y) {
          return x + " " + y;
    }
    // Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
    
    public static boolean arraySumOfNumbers(int[] numbers) {
      int sum = 0;
      for( int number : numbers ) {
       sum += number; 
      }
      if (sum > 100) {
         return true;
      } else {
        return false;
      }
    }
    //Write a method that takes an array of double and returns the average of all the elements in the array. 
      
    public static double calculateAverage(double[] array) {
      double total = 0;
      for(double number : array) {
        total += number;
      }
      return total / array.length;
     }
    
    //Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
    
      public static boolean calculateAverageForTwo(double[] array, double[] arrayTwo) {
        double sum = 0;
        for(double numbers : array) {
          sum += numbers / array.length;
        }
        double total = 0;
        for(double numbers : arrayTwo) {
          total += numbers / arrayTwo.length;
        }
        if(sum > total) {
          return true;
        } else {
          return false;
        }
      }
      
    //Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50. 
      
      public static boolean willBuyDrink(boolean temp, double money) {
          if(temp == true && money > 10.50) {
          return true;
        } else {
          return false;
        }
      }
      
    //Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
     // The method i created was a simple boolean expression of what time it is. If it is 11 or later, than i will sleep. If it is earlier than i will not sleep. 
      public static boolean sleepSchedule(int time) {
        if(time >= 11) {
          return true;
        } else {
          return false;
        }
      }
   } 
      
    


  
   
  