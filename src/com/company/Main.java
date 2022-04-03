package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 43));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || b < 10 || a > 99 || b > 99) {
            System.out.println("Input out of range");
            return false;
        }

        int lastDigita;
        int lastDigitb;
        int firstDigita;
        int firstDigitb;


        while (a > 0 && b > 0) {
            lastDigita = a % 10;
            lastDigitb = b % 10;

            firstDigita = a / 10;
            firstDigitb = b / 10;


            if (lastDigita == lastDigitb || lastDigita == firstDigitb ||
                    firstDigita == lastDigitb || firstDigita == firstDigitb) {
                System.out.println("a and b has shared digit");
                return true;
            } else break;

        } return false;

    }
}
