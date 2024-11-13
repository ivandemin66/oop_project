public abstract sealed class LandVehicle extends Vehicle permits Car, Motorcycle {
    public LandVehicle(String name, Engine engine) {
        super(name, engine);
    }
}