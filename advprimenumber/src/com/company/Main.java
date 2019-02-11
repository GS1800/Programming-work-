package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


	//
        Scanner console = new Scanner(System.in);
        int firstInput;
        int secondInput;
        while (true) {
            System.out.println("Enter a Positive Whole Number:");
            try {
                firstInput = Integer.parseInt(console.nextLine());
                if (firstInput < 0){
                    System.out.println("The number you enter should be a positive whole number, please reenter your input.");
                }
                else {
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("The number you enter should be a positive whole number, please reenter your input.");
            }
        }
        while (true) {
            System.out.println("Enter a Positive Whole Number:");
            try {
                secondInput = Integer.parseInt(console.nextLine());
                if (secondInput < 0){
                    System.out.println("The number you enter should be a positive whole number, please reenter your input.");
                }
                else {
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("The number you enter should be a positive whole number, please reenter your input.");
            }
        }

        if (firstInput > secondInput){
            int tempInput = secondInput;
            secondInput = firstInput;
            firstInput = tempInput;
        }
        if (firstInput < 2){
            firstInput = 2;
        }
        for (int Counter = firstInput; Counter <= secondInput; Counter++) {
            boolean Prime = true;
            for (int Divisor = 2; Divisor < Counter; Divisor++){
                if (Counter % Divisor == 0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime){
                System.out.println(Counter);
            }
        }
    }
}

