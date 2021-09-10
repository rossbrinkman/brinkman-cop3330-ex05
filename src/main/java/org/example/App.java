package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is the first number? " );

        Scanner scanner = new Scanner(System.in);
        int first, second, addition, subtraction, multiplication, division;

        first = scanner.nextInt();

        System.out.println( "What is the second number? " );
        second = scanner.nextInt();

        addition = first + second;
        subtraction = first - second;
        multiplication = first * second;
        division = first / second;

        System.out.println(
                first + " + " + second + " = " + addition + "\n" +
                first + " - " + second + " = " + subtraction + "\n" +
                first + " * " + second + " = " + multiplication + "\n" +
                first + " / " + second + " = " + division
        );
    }
}
