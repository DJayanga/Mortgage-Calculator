package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principl: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annalInterest = scanner.nextFloat();
        float monthlyInterest = annalInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double morgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String morgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(morgage);
        System.out.println("Morgage: "+ morgageFormatted);
    }


}