public class GasolinCar extends AFuelCar
{
    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType()
    {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee()
    {
        int fee = 0;

        if (this.getKmPrLitre() > 20)
        {
            fee = 330;
        }
        else if (this.getKmPrLitre() < 15 && this.getKmPrLitre() > 20)
        {
            fee = 1050;
        }
        else if (this.getKmPrLitre() > 10 && this.getKmPrLitre() < 20)
        {
            fee = 2340;
        }
        else if (this.getKmPrLitre() > 5 && this.getKmPrLitre() < 10)
        {
            fee = 5500;
        }
        else if (this.getKmPrLitre() <= 5)
        {
            fee = 10470;
        }

        return fee;
    }

    @Override
    public String toString()
    {
        String str = super.toString();
        str += "-\tFuel type: " + getFuelType() + "\n" +
                "-\tRegistration fee: " + getRegistrationFee() + "\n";
        return str;
    }
}
