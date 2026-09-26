

package Question1;

import java.util.Scanner;


public class RunApplication {


      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Single array for city names
        String[] Branches = {"Point road", "Musgrave", "Berea"};

        // Two-dimensional array: column 0 = Car, column 1 = Motor Bike
        int[][] Wash = new int[Branches.length][2];

        // Populate the array from user input
        for (int i = 0; i < Branches.length; i++) {
            System.out.print("Enter Basic wash services for " + Branches[i] + ": ");
            Wash[i][0] = sc.nextInt();
            System.out.print("Enter full valet services for " + Branches[i] + ": ");
            Wash[i][1] = sc.nextInt();
        }

        // Print the report
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("CAR WASH SERVICE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-18s%-12s%-12s%n", "", "Basic Wash", "Full Valet");
        for (int i = 0; i < Branches.length; i++) {
            System.out.printf("%-18s%-12d%-12d%n", Branches[i],Wash[i][0], Wash[i][1]);
        }

        // Calculate the total for each city
        int[] totals = new int[Branches.length];
        for (int i = 0; i < Branches.length; i++) {
            totals[i] = Wash[i][0] + Wash[i][1];
        }

        // Print the totals
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("BRANCH TOTALS");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < Branches.length; i++) {
            System.out.printf("%-18s%d%n", Branches[i], totals[i]);
        }

        // Find the city with the highest total
        int highest = 0;
        for (int i = 1; i < totals.length; i++) {
            if (totals[i] > totals[highest]) {
                highest = i;
            }
        }
        System.out.println();
        System.out.println("BRANCH WITH THE HIGHIEST TOTAL: " + Branches[highest]);
        System.out.println("--------------------------------------------------");
    }
}