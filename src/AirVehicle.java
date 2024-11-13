public abstract sealed class AirVehicle extends Vehicle permits Airplane {
    public AirVehicle(String name, Engine engine) {
        super(name, engine);
    }
}