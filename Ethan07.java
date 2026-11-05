/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ethan07;

import java.util.Scanner;

/**
 *
 * @author GAMUTIN_CPE113
 */
public class Ethan07 {

    // PROBLEM 1 METHODS

    public static double calculateAverage(double prelim, double midterm, double finals) {

        double average = (prelim + midterm + finals) / 3;
        return average;

    }

    public static char getGradeEquivalent(double average) {

        if (average >= 90) {
            return 'A';
        } else if (average >= 85) {
            return 'B';
        } else if (average >= 80) {
            return 'C';
        } else if (average >= 75) {
            return 'D';
        } else {
            return 'F';
        }

    }

    public static boolean isPassed(double average) {

        if (average >= 75) {
            return true;
        } else {
            return false;
        }
    }

    // PROBLEM 2 METHODS

    public static double calculateConsumptionCharge(double consumption, double rate) {

        double charge = consumption * rate;
        return charge;

    }

    public static double calculateAdditionalCharge(double consumptionCharge, double percentage) {

        double additionalCharge = consumptionCharge * (percentage / 100);
        return additionalCharge;

    }

    public static double calculateTotalBill(double consumptionCharge, double additionalCharge) {

        double totalBill = consumptionCharge + additionalCharge;
        return totalBill;

    }

    // PROBLEM 3 METHODS

    public static int calculateSum(int[] scores) {

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        return sum;

    }

    public static double calculateAverage(int[] scores) {

        int sum = calculateSum(scores);

        double average = (double) sum / scores.length;

        return average;

    }

    public static int findHighest(int[] scores) {

        int highest = scores[0];

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] > highest) {
                highest = scores[i];
            }

        }

        return highest;

    }

    public static int findLowest(int[] scores) {

        int lowest = scores[0];

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] < lowest) {
                lowest = scores[i];
            }

        }

        return lowest;

    }

    public static int countPassing(int[] scores) {

        int passing = 0;

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= 75) {
                passing++;
            }

        }

        return passing;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // PROBLEM 1: STUDENT GRADE EVALUATOR

        System.out.println("==================================");
        System.out.println("     PROBLEM 1: STUDENT GRADE");
        System.out.println("==================================");

        System.out.print("Enter Prelim Score: ");
        double prelim = input.nextDouble();

        System.out.print("Enter Midterm Score: ");
        double midterm = input.nextDouble();

        System.out.print("Enter Final Score: ");
        double finals = input.nextDouble();

        double average = calculateAverage(prelim, midterm, finals);
        char grade = getGradeEquivalent(average);
        boolean passed = isPassed(average);

        System.out.println("\n--- STUDENT GRADE RESULT ---");
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Grade Equivalent: " + grade);

        if (passed == true) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }

        // PROBLEM 2: ELECTRICITY BILL CALCULATOR

        System.out.println("\n==================================");
        System.out.println("   PROBLEM 2: ELECTRICITY BILL");
        System.out.println("==================================");

        System.out.print("Enter Electricity Consumption (kWh): ");
        double consumption = input.nextDouble();

        System.out.print("Enter Rate per kWh: ");
        double rate = input.nextDouble();

        System.out.print("Enter Additional Charge Percentage: ");
        double percentage = input.nextDouble();

        double consumptionCharge = calculateConsumptionCharge(consumption, rate);

        double additionalCharge = calculateAdditionalCharge(consumptionCharge, percentage);

        double totalBill = calculateTotalBill(consumptionCharge, additionalCharge);

        System.out.println("\n--- ELECTRICITY BILL RESULT ---");
        System.out.printf("Consumption Charge: PHP %.2f\n", consumptionCharge);
        System.out.printf("Additional Charge: PHP %.2f\n", additionalCharge);
        System.out.printf("Total Electricity Bill: PHP %.2f\n", totalBill);

        // PROBLEM 3: ARRAY STATISTICS ANALYZER

        System.out.println("\n==================================");
        System.out.println("   PROBLEM 3: ARRAY STATISTICS");
        System.out.println("==================================");

        System.out.print("Enter the number of scores: ");
        int size = input.nextInt();

        if (size <= 0) {

            System.out.println("Invalid array size. Please enter a number greater than zero.");

        } else {

            int[] scores = new int[size];

            // INPUT SCORES

            for (int i = 0; i < scores.length; i++) {

                System.out.print("Enter score " + (i + 1) + ": ");
                scores[i] = input.nextInt();

            }

            // CALL THE METHODS

            int sum = calculateSum(scores);
            double arrayAverage = calculateAverage(scores);
            int highest = findHighest(scores);
            int lowest = findLowest(scores);
            int passing = countPassing(scores);

            // DISPLAY RESULTS

            System.out.println("\n--- STATISTICAL INFORMATION ---");
            System.out.println("Total Number of Scores: " + scores.length);
            System.out.println("Sum of Scores: " + sum);
            System.out.println("Average Score: " + arrayAverage);
            System.out.println("Highest Score: " + highest);
            System.out.println("Lowest Score: " + lowest);
            System.out.println("Number of Passing Students: " + passing);

        }

        input.close();

    }
}
