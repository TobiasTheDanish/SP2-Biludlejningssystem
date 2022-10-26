public class DieselCar extends AFuelCar
{
    private final boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre,
                     boolean particleFilter)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter()
    {
        return particleFilter;
    }

    @Override
    public String getFuelType()
    {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee()
    {
        int fee = 0;

        if (this.getKmPrLitre() > 20)
        {
            fee = 330 + 130;
            fee += hasParticleFilter() ? 0 : 1000;
        }
        else if (this.getKmPrLitre() < 15 && this.getKmPrLitre() > 20)
        {
            fee = 1050 + 1390;

            fee += hasParticleFilter() ? 0 : 1000;
        }
        else if (this.getKmPrLitre() > 10 && this.getKmPrLitre() < 20)
        {
            fee = 2340 + 1850;

            fee += hasParticleFilter() ? 0 : 1000;
        }
        else if (this.getKmPrLitre() > 5 && this.getKmPrLitre() < 10)
        {
            fee = 5500 + 2770;

            fee += hasParticleFilter() ? 0 : 1000;
        }
        else if (this.getKmPrLitre() <= 5)
        {
            fee = 10470 + 15260;

            fee += hasParticleFilter() ? 0 : 1000;
        }

        return fee;
    }

    @Override
    public String toString()
    {
        String str = super.toString();
        str += "-\tFuel type: " + getFuelType() + "\n" +
                "-\tRegistration fee: " + getRegistrationFee() + "\n" +
                "-\tHas particle filter: " + hasParticleFilter() + "\n";
        return str;
    }
}
