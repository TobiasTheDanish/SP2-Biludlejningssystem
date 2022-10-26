public class ElectricCar extends ACar
{
    private final int batteryCapacity;
    private final int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity,
                       int maxRange)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh()
    {
        return batteryCapacity;
    }

    public int getMaxRange()
    {
        return maxRange;
    }

    public int getWhPrKm()
    {
        return (1000*batteryCapacity)/maxRange;
    }

    @Override
    public int getRegistrationFee()
    {
        int whPrKm = getWhPrKm();
        int kmPrL = (int)(100/(whPrKm/91.25));
        int fee = 0;

        if (kmPrL > 20)
        {
            fee = 330;
        }
        else if (kmPrL > 15 && kmPrL < 20)
        {
            fee = 1050;
        }
        else if (kmPrL > 10 && kmPrL < 20)
        {
            fee = 2340;
        }
        else if (kmPrL > 5 && kmPrL < 10)
        {
            fee = 5500;
        }
        else if (kmPrL <= 5)
        {
            fee = 10470;
        }

        return fee;
    }

    @Override
    public String toString()
    {
        String str = super.toString();
        str += "-\tBattery capacity : " + getBatteryCapacityKWh() + " KWh\n" +
                "-\tMax range: " + getMaxRange() + " Km\n" +
                "-\tWh/Km: " + getWhPrKm() + "\n" +
                "-\tKm/L: " + (int)(100/(getWhPrKm()/91.25)) + "\n" +
                "-\tRegistration fee: " + getRegistrationFee() + "\n";
        return str;
    }
}
