/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package base;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Exercise 23 - Troubleshooting Car Issues
An expert system is a type of artificial intelligence program that uses a knowledge base and a set of rules to
perform a task that a human expert might do. Many websites are available that will help you self-diagnose a medical
issue by answering a series of questions. And many hardware and software companies offer online troubleshooting tools
to help people solve simple technical issues before calling a human.

Example Output

Is the car silent when you turn the key? y
Are the battery terminals corroded? n
Replace cables and try again.

Constraint

Ask only questions that are relevant to the situation and to the previous answers. Don’t ask for all inputs at once.

Challenge

Investigate rules engines and inference engines. These are powerful ways to solve complex problems that are based on
rules and facts. Identify a rules engine for your programming language and use it to solve this problem
*/
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key? (y/n)");
        String yesOrNo = input.nextLine();
        input.next();

        if(yesOrNo.equals("y")) {
            System.out.println("Are the battery terminals corroded? (y/n)");
            yesOrNo = input.nextLine();

            if(yesOrNo.equals("y")) {
                System.out.println("Clean terminals and try starting again.");
            } else {
                System.out.println("Replace cables and try again.");
            }
        } else {
            System.out.println("Does the car make a slicking noise? (y/n)");
            yesOrNo = input.nextLine();

            if(yesOrNo.equals("y")) {
                System.out.println("Replace the battery.");
            } else {
                System.out.println("Does the car crank up but fail to start? (y/n)");
                yesOrNo = input.nextLine();

                if(yesOrNo.equals("y")) {
                    System.out.println("Check spark plug connections.");
                } else {
                    System.out.println("Does the engine start and then die? (y/n)");
                    yesOrNo = input.nextLine();

                    if(yesOrNo.equals("y")) {
                        System.out.println("Does you car have fuel injection? (y/n)");
                        yesOrNo = input.nextLine();

                        if(yesOrNo.equals("y")) {
                            System.out.println("Get it in for service.");
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }

                    } else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }



    }

}
