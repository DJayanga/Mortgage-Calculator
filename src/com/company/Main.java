package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        while (true) {
            System.out.print("Principl: ");
            principal =scanner.nextInt();
            if(principal >= 1000 && principal <=1_000_000)
            break;
            System.out.println("Please enter a valuer between 1000 and 1000000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annalInterest = scanner.nextFloat();
            if (annalInterest >= 1 && annalInterest <=30) {
                monthlyInterest = annalInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
        }
        double morgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String morgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(morgage);
        System.out.println("Morgage: "+ morgageFormatted);
    }


}