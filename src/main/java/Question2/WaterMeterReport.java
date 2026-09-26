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

    public void printAttendanceReport() {
        System.out.println();
        System.out.println("ATTENDANCE REPORT");
        System.out.println("********************");
        System.out.println("SUBJECT: " + getPropertyAddress());
        System.out.println("STUDENTS PRESENT: " + getCurrentReading());
        System.out.println("STUDENTS ENROLLED: " + getPreviousReading());

        double percentage = (double)getCurrentReading() / getPreviousReading() * 100;
        if (percentage < 75) {
            System.out.println("LOW ATTENDANCE WARNING");
        }
    }
}
    
    

