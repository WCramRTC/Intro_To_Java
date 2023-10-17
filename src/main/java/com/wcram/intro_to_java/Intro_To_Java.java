/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.wcram.intro_to_java;

import java.util.Scanner;

/**
 *
 * @author WCram
 */
public class Intro_To_Java {
    
    // 6 Fundamentals
    /*
        inputs
        outputs
        loops
        conditions
        operations
        variables
        collections ( arrays )
    */
    
    
    public static void main(String[] args) {
        // string userInput = Console.ReadLine()
        System.out.println("Please enter your favorite red color in number :");   
        // KNOW THIS LINE FOR GETTING YOUR INPUT
        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
        int usersColor = scanner.nextInt();
        // IMPORTANT NOTE: <----- ALL CAPS
        // Flush your scanner
        // IF you use your scanner for something other than a string, call scanner.nextLine() afterwards
        scanner.nextLine(); // <--- Not saving the value
        
        // Example
        // boolean isItRaining = scanner.nextBoolean();
        // scanner.nextLine();
        
        
        System.out.println("Hello, " + usersColor); // output
        // System.out.println() is the same as Console.WriteLine()
    
        

        
        // try / catch
        

        

    
    // Ctrl + / is the comment AND uncomment hotkey
    // Variable scope
    // Global 
    // Local
//            access modifiers are the same
//public, private, protected, 
//
//Java does not have an internal access modifier
//
//-------------
//To get the users input
//Make a Sanner object that takes a System.in object
//Scanner scanner = new Scanner(System.in);
//Then you can use scanner like ReadLine
    }
    
    public static void Variables() {
                
        // String, int, double, bool
        // String ( collection of characters ), char ( single character )
        // int ( byte, short, int, long ) ( whole number )
        // double ( float, double ) ( decimal numbers )
        // boolean ( true and false )
        
    }
    
        public static void Loops() {
               // Loops
        // While
//            while(false) {
//                //  code runs
//            }
            
            // do while
//            do {
//                
//            } while (true);
            
            // Shortcuts : F6 to run the project, F11 to build it
            
        // For ( are the same )
            for(int i = 0; i < 10; i++) { /* Code Runs */}
        
        // foreach
            String[] names = new String[3];
            names[0] = "Prince";
            names[1] = "Ronda";
            names[2] = "Jon";
            
            // for(TYPE var Name : array name)
            for(String name : names) {
                System.out.println(name);
            }
            
            // Parsing - Parse using the object type
            // Integer
            String ageString = "25";
            int age = Integer.parseInt(ageString);
            System.out.println(age);
   
    }
    
            public static void Conditions() {
                // Conditions
        // Decision code blocks
        // if ( true / false ) { runable code }
        // else if ( true / false )  { runable code }
        // else { run code }
        // switch : switch, case, break, default
        
 
    }
    
    public static void Operations() {
                 
            // Operators
            // Math Operators ( Return a number ) : +, -, *, /, %, ++, --
            // Concatenation ( add two strings ) : +, +=
            // Assignment Operator (assigns a value) : =
            // Compound Operators (Performs math and assigns a value) : +=, -=, *+, /=, %=, ++, --
            
            // Logical Operators : && ( And , both true) , || ( Or, one has to be true), ! ( Not, Not true)
            // Comparison Operators ( Also returns true / and false) : 
            //  Exclusive ( Only works on numbers): >, <, 
            //  Inclusive ( Only works on numbers ) : >=, <=
            //  Equals : == ( Compares two objects to see if they are the same )
            //  Not Equal : != ( Compares two and checks if they are different )
            

    }
    
    
    // TO create a method do public static return Type Name(parameters) { code }
    public static double Add(double num1, double num2) {
        return num1 + num2;
    }
    
    
}
