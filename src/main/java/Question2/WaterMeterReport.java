/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author jenni
 */
public  class WaterMeterReport extends WaterMeter {
        public WaterMeterReport(String PropertyAddress, int  CurrentReading, int PreviousReading) {
        super(PropertyAddress, CurrentReading, PreviousReading);
    }

    public void printWaterMeterReport() {
        System.out.println();
        System.out.println("WATER METER  REPORT");
        System.out.println("********************");
        System.out.println("PROPERTY : " + getPropertyAddress());
        System.out.println("CURRENT READING : " + getCurrentReading());
        System.out.println("PREVIOUS READING: " + getPreviousReading());

        double percentage = (double)getCurrentReading() / getPreviousReading() * 100;
        if (percentage < 75) {
            System.out.println("COMSUPTION :" + (double)getCurrentReading() / getPreviousReading() * 100 );
            System.out.println("HIGH USAGE ALERT");
        }
    }
}
    
    

