import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honoring the CIS academic honesty pledge
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Maddy
*****************************************************************************************************
*/



    public class Main {
    public static void main(String[] args) {
        int a = 5; //Question 1.
        int b = 7;

        int sum = add(a, b);
        System.out.println(sum);

        int c = 6; //Question 2.
        int d = 6;
                int finalSum = add(a, b, c, d);
        System.out.println(finalSum);

        String name = "Toby Fox"; //Question 3.
        System.out.println(morningGreeting(name));

        String secondname = "Mac Miller"; //Question 4.
        System.out.println(afternoonGreeting(secondname));

        String baby = triple("oohbaby"); //Question 5.
        System.out.println(baby);

        int f = 19; //Question 6.
        double halfValue = half(f);
        System.out.println(halfValue);

        double roundedFirst = 8.5; //Question 7.
        double roundedSecond = 8.49;
        int roundValue = roundPositiveValueToNearestInteger(roundedFirst);
        int roundValuetwo = roundPositiveValueToNearestInteger(roundedSecond);
        System.out.println(roundPositiveValueToNearestInteger(roundValue));
        System.out.println(roundPositiveValueToNearestInteger(roundValuetwo));

        double negativeRoundedFirst = -8.49; //Question 8.
        double negativeRoundedSecond = -8.5;
        int negativeRoundValue = roundNegativeValueToNearestInteger(negativeRoundedFirst);
        int negativeRoundValuetwo = roundNegativeValueToNearestInteger(negativeRoundedSecond);
        System.out.println(roundNegativeValueToNearestInteger(negativeRoundValue));
        System.out.println(roundNegativeValueToNearestInteger(negativeRoundValuetwo));

    }

    static int add(int a, int b) {
        int sum = a + b;
        return sum;

    }

    static int add(int a, int b, int c, int d) {
        int firstSum = add(a, b);
        int secondSum = add(c, d);
        int finalSum = add(firstSum, secondSum);
                return finalSum;

    }

    static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    static String afternoonGreeting(String secondname) {
        return "下午好, " + secondname + "!";
    }

    static String triple(String baby) {
        return baby + baby + baby;
    }

    static double half(int f) {
        double halfValue = f/2.0;
        return halfValue;
    }

    static int roundPositiveValueToNearestInteger(double number) {
        int roundValue = (int) (number + 0.5);
        return roundValue;
    }

    static int roundNegativeValueToNearestInteger(double number) {
        int negativeRoundValue = (int) (number - 0.5);
        return negativeRoundValue;
    }
}