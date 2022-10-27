public class Main
{
    public static void main(String[] args)
    {
        FleetOfCars fleet = new FleetOfCars();

        fleet.addCar(new ElectricCar("AB 12345", "Tesla", "S-Model", 5, 100, 515));
        fleet.addCar(new DieselCar("JK 34567", "Audi", "A6", 5, 30, true));
        fleet.addCar(new GasolinCar("ÅØ 98765", "Mercedes", "AMG C-Class", 5, 18));
        fleet.addCar(new ElectricCar("AB 12345", "Tesla", "X-Model", 5, 90, 400));
        fleet.addCar(new DieselCar("JK 34567", "Audi", "A4 Sport", 5, 12, true));
        fleet.addCar(new GasolinCar("ÅØ 98765", "Land Rover", "Range Rover", 2, 5));

        System.out.println(fleet);

        System.out.println("- Total registration fee: " + fleet.getTotalRegistrationFeeForFleet());
    }
}
