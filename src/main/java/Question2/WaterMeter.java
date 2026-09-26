
package Question2;


public abstract class WaterMeter implements IWaterMeter{
    private String PropertyAddress;
    private int CurrentReading;
    private int PreviousReading;   

    public  WaterMeter (String  PropertyAddress, int CurrentReading, int PreviousReading) {
        this.PropertyAddress = PropertyAddress;
        this.CurrentReading = CurrentReading;
        this.PreviousReading = PreviousReading;
    }

    public String  getPropertyAddress() {
        return PropertyAddress;
    }

    public int getStudentsPresent() {
        return CurrentReading;
    }

    public int getPreviousReading() {
        return PreviousReading;
    }
}
    

