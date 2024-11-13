public final class Motorcycle extends LandVehicle {
    public Motorcycle(String name, Engine engine) {
        super(name, engine);
    }

    @Override
    public void move() {
        System.out.println(name + " мотоцикл едет.");
    }

    @Override
    public void stop() {
        System.out.println(name + " мотоцикл остановился.");
    }
}