package com.example.main;
import java.util.Arrays;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our Java Unit 3 Closing CFU");

      /*
        Some activities for Array
      */

        //create an array (not an ArrayList) called favoriteColors that holds five strings with your favoriteColors and print the entire array to the screen.
        String[] favoriteColors = {
                "black", "blue", "red", "cornsilk", "pumpernickel"
        };
        System.out.println(Arrays.toString(favoriteColors));

        //Change the third element of favoriteColors to a different color and print that element to the screen
        favoriteColors[2] = "vibrant gray";
        System.out.println(favoriteColors[2]);

        //Declare and initialize and array of type int called numbers to hold 1000 elements (this should be used later in the loop exercise)
        int[] numbers = new int[1000];


        //ArrayList

        //Declare and initialize an ArrayList so that it holds values of type <Double>.
        ArrayList<Double> prices = new ArrayList<>();

        //Using the .add() method, add 5 decimal values to the ArrayList and print it to the screen
        prices.add(27.99);
        prices.add(22.99);
        prices.add(12.5);
        prices.add(10.99);
        prices.add(1.98);
        System.out.println(prices);

        //Using the .remove() method, remove the 3rd value in the ArrayList.
        prices.remove(prices.get(2));

        //Print ArrayList to the screen.
        System.out.println(prices);

        //Now change the last element in the ArrayList and print the new element to the screen
        prices.set(prices.size() - 1, .89);
        System.out.println(prices.get(prices.size() - 1));

    /*
      Some activities for Loops
    */
        // write a for loop that prints out numbers 1-1000 and saves these numbers to the empty array you created earlier
        for(int number = 0; number < 1000; number++){
//            System.out.println(number);
            numbers[number] = number + 1;
        }
        System.out.println(Arrays.toString(numbers));

        // write a while loop that prints the elements of the array you used in the previous exercise. Take care to avoid infinite looping!
        int i = 0;
        while(i < numbers.length){
            System.out.println(numbers[i]);
            i++;
        }

        //write a do-while loop that does the same.
        int j = 0;
        do {
            System.out.println(numbers[j]);
            j++;
        } while(j < numbers.length);

        // write an enhanced for loop that iterates over this array and prints the result of that number modulus(%) 3
        for(int integer : numbers){
            System.out.println(integer % 3);
        }

    /*
      Some activities for String methods
    */
        // Create two String variables, one holding "Hello" and one holding "world"
        String hello = "Hello";
        String world = "world";

        // using String methods, concatenate these strings together with a space between them so that it reads "Hello world" and save the resulting String to a new variable
        String phrase = hello + " " + world;

        // then, create a for loop that iterates over your new String and prints each letter out using sout
        for(int a = 0; a < phrase.length(); a++){
            char c = phrase.charAt(a);
            System.out.print(c+"\n");
        }


    /*
      Combination Exercises
    */


        // Create a variable that stores a String with the value "Testing out String methods"
        String test = "Testing out String methods";

        // Use the String's .split() method with the input of '\s' save an array containing each word of your String variable
        String[] testWords = test.split("\\s");

        // Using a loop of your choosing, loop through the array of strings and print each word to the screen in all caps, along with its length
        for(String word : testWords){
            System.out.println(word.toUpperCase()+ ": " + word.length());
        }

        // CHALLENGE: search the Oracle Documentation to find out how to sort an array, then print the sorted array to the string
        Arrays.sort(testWords);
        System.out.println(Arrays.toString(testWords));
    }
}