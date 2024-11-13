public final class Airplane extends AirVehicle {
    public Airplane(String name, Engine engine) {
        super(name, engine);
    }

    @Override
    public void move() {
        System.out.println(name + " летит в небе.");
    }

    @Override
    public void stop() {
        System.out.println(name + " приземляется.");
    }
}