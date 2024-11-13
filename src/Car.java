public final class Car extends LandVehicle {
    public Car(String name, Engine engine) {
        super(name, engine);
    }

    @Override
    public void move() {
        System.out.println(name + " едет по дороге.");
    }

    @Override
    public void stop() {
        System.out.println(name + " останавливается.");
    }
}