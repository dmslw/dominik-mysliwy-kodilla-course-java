package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
public class TestingMain {

    public static void main(String[] args) {


        Calculator operationObject = new Calculator();

        double userInput;
        double userInput1;
        int userChoice;
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The First Number: ");
        userInput1 = input.nextDouble();
        System.out.print("Please Enter The Second Number: ");
        userInput = input.nextDouble();
        System.out.println("Please Select Operation to Perform:");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");

        userChoice = input.nextInt();

        switch (userChoice){
            case 1:
                System.out.println(operationObject.addition(userInput, userInput1));
                break;
            case 2:
                System.out.println(operationObject.subtraction(userInput, userInput1));
                break;
            default:
                System.out.print("Test Error! operator is not correct");


        }


    }


        }






