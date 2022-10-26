import java.util.ArrayList;

public class FleetOfCars
{
    private ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car)
    {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet()
    {
        int total = 0;

        for (Car c : fleet)
        {
            total += c.getRegistrationFee();
        }

        return total;
    }

    @Override
    public String toString()
    {
        String str = "FleetOfCars:\n- Total registrations fee: " + getTotalRegistrationFeeForFleet() + "\n\n";

        int i = 0;
        for (Car c : fleet)
        {
            i++;
            str += "Car #" + i + ":\n" +c + "\n";
        }

        return str;
    }
}
