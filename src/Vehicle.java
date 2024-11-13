public abstract sealed class Vehicle implements Transport permits AirVehicle, Boat, LandVehicle {
    protected String name;
    protected Engine engine;

    public Vehicle(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }
    @Override
    public String getInfo() {
        return "Название: " + name + ", Мощность: " + engine.getPower() + " л.с., Топливо: " + engine.getFuelType();
    }
}