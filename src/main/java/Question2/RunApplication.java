
package Question2;

import java.util.Scanner;


public class RunApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the property Address : ");
        String PropertyAddress = sc.nextLine();

        System.out.print("Enter the current meter reading : ");
        int CurrentReading = sc.nextInt();

        System.out.print("Enter the previous meter reading : ");
        int PreviousReading = sc.nextInt();

         WaterMeterReport report = new  WaterMeterReport(PropertyAddress, CurrentReading, PreviousReading);
        report.printWaterMeterReport();
    }
}