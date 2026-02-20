package Demo;

import java.awt.*;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Main {

    static void main(String[] args) {

    Main obj = new Main();
    Scanner sc = new Scanner(System.in);

// Question 24: Reverse a String
//Problem Statement:
//Write a Java program that asks the user for a string and then prints the reverse of that
//string

        System.out.println("Enter your fullName");
        String in = sc.nextLine();
        for(int i = in.length()-1 ; i>=0; i--)
        {
            char s = in.charAt(i);
            System.out.print(s);
        }

        System.out.println();



// Question 25: Count Vowels in a String
//Problem Statement:
//Write a Java program that asks the user for a string and counts the number of vowels (a,
//e, i, o, u) in the string. The program should then print the total number of vowels.
        System.out.println("Enter a string");

        String input = sc.nextLine();
        input = input.toLowerCase();
        int result = 0;
        for(int i = 0 ; i<input.length(); i++)
        {
            char c = input.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                result++;
            }
        }
        System.out.println("Number of vowels in the programing is:" + result);

    // Question 26: Check if a String is a Palindrome
        //Problem Statement:
        //Write a Java program that asks the user for a string and checks whether the string is a
        //palindrome. A palindrome is a string that reads the same backward as forward (ignoring
        //spaces and punctuation.















        // Question 27: String Literal and Object Creation
        //Problem Statement:
        //Write a Java program that creates two string variables using string literals with the same
        //content. Then, print whether both variables point to the same object.


        String str1 = "hello";
        String str2= "hello";

        if(str1 == str2)
        {
            System.out.println("Both variable point the same object: true");
        }else
        {
            System.out.println("Both object is not pointing same object: false");
        }





    }


}
