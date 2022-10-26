public abstract class ACar implements Car
{
    protected final String registrationNumber;
    protected final String make;
    protected final String model;
    protected final int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors)
    {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    @Override
    public String getMake()
    {
        return make;
    }

    @Override
    public String getModel()
    {
        return model;
    }

    @Override
    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    @Override
    public String toString()
    {
        return  "-\tMake: " + make + '\n' +
                "-\tModel: " + model + '\n' +
                "-\tRegistration number: " + registrationNumber + '\n' +
                "-\tNumber of doors: " + numberOfDoors + '\n';
    }
}
