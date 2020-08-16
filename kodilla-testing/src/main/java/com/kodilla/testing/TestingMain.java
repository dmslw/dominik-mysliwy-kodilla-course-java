package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator(1, 2);

        int result1 = calculator.addAToB();
        int result2 = calculator.subtractAFromB();

        if (result1 == 3){
            System.out.println("test OK");
        }
        if (result2 == 3){
            System.out.println("test drugiej metody OK");

        } else {

            System.out.println("error!");
        }
        
            
        }
    }

