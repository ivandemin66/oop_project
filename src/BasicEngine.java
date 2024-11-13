public class BasicEngine implements Engine {
    private final FuelType fuelType;
    private final int power;

    public BasicEngine(FuelType fuelType, int power) {
        this.fuelType = fuelType;
        this.power = power;
    }

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public int getPower() {
        return power;
    }
}