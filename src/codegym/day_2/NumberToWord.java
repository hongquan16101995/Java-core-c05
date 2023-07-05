package codegym.day_2;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số bất kỳ: ");
        int number;
        do {
            number = scanner.nextInt();
            int hundred = number / 100;
            int dozen = (number % 100) / 10;
            int unit = number % 10;

            String word = "";
            if (number < 20) {
                word += getWordUnitAndHundred(number);
            } else if (number < 100) {
                word += getWordDozen(dozen) + " " + getWordUnitAndHundred(unit);
            } else if (dozen == 1) {
                word += getWordUnitAndHundred(hundred) + " hundred "
                        + getWordUnitAndHundred(number % 100);
            } else {
                word += getWordUnitAndHundred(hundred) + " hundred "
                        + getWordDozen(dozen) + " " + getWordUnitAndHundred(unit);
            }
            System.out.println(word);
        } while (number != 1000);
    }

    private static String getWordDozen(int value) {
        String word = "";
        switch (value) {
            case 2:
                word += "twenty";
                break;
            case 3:
                word += "thirty";
                break;
            case 4:
                word += "forty";
                break;
            case 5:
                word += "fifty";
                break;
            case 6:
                word += "sixty";
                break;
            case 7:
                word += "seventy";
                break;
            case 8:
                word += "eighty";
                break;
            case 9:
                word += "ninety";
                break;
        }
        return word;
    }

    private static String getWordUnitAndHundred(int value) {
        String word = "";
        switch (value) {
            case 1:
                word += "one";
                break;
            case 2:
                word += "two";
                break;
            case 3:
                word += "three";
                break;
            case 4:
                word += "four";
                break;
            case 5:
                word += "five";
                break;
            case 6:
                word += "six";
                break;
            case 7:
                word += "seven";
                break;
            case 8:
                word += "eight";
                break;
            case 9:
                word += "nine";
                break;
            case 10:
                word += "ten";
                break;
            case 11:
                word += "eleven";
                break;
            case 12:
                word += "twelve";
                break;
            case 13:
                word += "thirteen";
                break;
            case 14:
                word += "fourteen";
                break;
            case 15:
                word += "fifteen";
                break;
            case 16:
                word += "sixteen";
                break;
            case 17:
                word += "seventeen";
                break;
            case 18:
                word += "eighteen";
                break;
            case 19:
                word += "nineteen";
                break;
        }
        return word;
    }
}
