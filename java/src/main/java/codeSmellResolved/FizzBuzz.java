package codeSmellResolved;

/**
 * Requirements:
 * For factor of three print Fizz instead of the number
 * For factor of five print Buzz instead of the number
 * For numbers which are factors of both three and five print FizzBuzz instead of the number
 */

public class FizzBuzz {
    public static String say(int number) {

        if (checkFactor(number, 15)) return "FizzBuzz";
        else if (checkFactor(number, 3)) return "Fizz";
        else if (checkFactor(number, 5)) return "Buzz";

        return String.valueOf(number);
    }

    public static boolean checkFactor(int number1, int number2){
        return number1 % number2 == 0;
    }

}
