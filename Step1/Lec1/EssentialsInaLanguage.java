    package Step1.Lec1;

import java.util.Scanner;

/* ================================================================== */

    public class EssentialsInaLanguage {

        public static void dataTypesAndInputOutput() {
            /* 
                DataTypes In Java
                //for integers
                1.Byte ( -127 to +127) or (In Exponentials)
                2.Short ( ) & (In Exponentials)
                3.Int  ( ) & (In Exponentials)
                4.long int ( ) & (In Exponentials)
                //for Floats
                1.Float  ( ) & (In Exponentials)
                2.Double ( ) & (In Exponentials)
                //for Chars & Strings
                1.Char
                2.Strings

            */
    
            Scanner sc = new Scanner(System.in);
            
            // Taking a Byte and printing it

            System.out.print("Enter Byte Value : "); 
            byte byteValue = sc.nextByte();
            System.out.println("The Byte You have Entered : " + byteValue);
            
            // Taking a Short and printing it

            System.out.print("Enter Short Value : "); 
            short shortValue = sc.nextShort();
            System.out.println("The Short You have Entered : " + shortValue);
            
            // Taking an Integer and printing it

            System.out.print("Enter Integer Value : "); 
            int intValue = sc.nextInt();
            System.out.println("The Integer You have Entered : " + intValue);
            
            // Taking a Long and printing it

            System.out.print("Enter Long Value : "); 
            long longValue = sc.nextLong();
            System.out.println("The Long You have Entered : " + longValue);
            
            // Taking a Float and printing it

            System.out.print("Enter Float Value : "); 
            float floatValue = sc.nextFloat();
            System.out.println("The Float You have Entered : " + floatValue);
            
            
            // Taking a Double and printing it

            System.out.print("Enter Double Value : "); 
            double doubleValue = sc.nextDouble();
            System.out.println("The Double You have Entered : " + doubleValue);
            

            

            // Taking an Char and printing it

            System.out.print("Enter Char Value : "); 
            char charValue = sc.next().charAt(0);
            System.out.println("The Char You have Entered : " + charValue);
            

            // Taking a String and Printing it 

            System.out.println("Enter a String : ");
            String stringValue = sc.next();
            System.out.println("The String You have Entered : " + stringValue);

            sc.close();
    

            /* 
                Questions
                1. How to take Character as an input in java .
                2. How to take Full line as a string in java .
            */
        }

        static void eligibleForJobOrNot() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your age : ");
            int age = sc.nextInt();
            System.out.println("");
            if(age >= 21) {
                if(age >=60){
                    System.out.println("You are Retired !..");
                }
            else  if(age > 55)
            {
                System.out.println("You are eligible for Job !..  but retirement soon ..");
            }
            else {
                System.out.println("You are eligible for Job !..");
            }
            
        }
        System.out.println("");
        sc.close();
        }
        public static void main(String[] args) {
            
            /* ================================== */

                /*  Things to Know In Java */

                    /* =========================================== */

                    /*  Java Basics */

                    // Data Types && Input/Output

                    // dataTypesAndInputOutput();

                    // if-else-if
                    
                    // eligibleForJobOrNot();

                    // Switch Case

                    // What are Arrays & Strings

                    // For Loops

                    // While Loops

                    // Functions

                    // Time & Space Complexity Theory In Depth

                    /* =========================================== */
                    

                   
            /* ================================== */

        }
        
    }

    /* ================================================================== */